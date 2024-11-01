package kyh_4_advanced2.was.httpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;
import static kyh_4_advanced2.util.MyLogger.log;

public class HttpRequest {
    private String method;
    private String path;
    private final Map<String, String> queryParameters = new HashMap<>();
    private final Map<String, String> headers = new HashMap<>();

    public HttpRequest(BufferedReader reader) throws IOException {
        parseRequestLine(reader);
        parseHeaders(reader);
        parseBody(reader); // 추가
    }

    // METHOD /path?key=value&key=value... HTTP_version 을 처리
    private void parseRequestLine(BufferedReader reader) throws IOException {
        String requestLine = reader.readLine();
        if (requestLine == null) {
            throw new IOException("EOF: No request line received");
        }

        // 예) GET /search?q=hello&hl=ko HTTP/1.1
        // => { GET, /search?q=hello&hl=ko, HTTP/1.1 }
        String[] parts = requestLine.split(" ");
        if (parts.length != 3) {
            throw new IOException("Invalid request line: " + requestLine);
        }

        // GET
        method = parts[0];

        // { /search, q=hello&hl=ko }
        String[] pathParts = parts[1].split("[?]");
        path = pathParts[0];
        if (pathParts.length > 1) {
            parseQueryParameters(pathParts[1]);
        }
    }

    // ? 이후의 key=value&key=value... 를 처리
    private void parseQueryParameters(String queryString) {
        for (String param : queryString.split("&")) {
            String[] keyValue = param.split("=");

            String key = URLDecoder.decode(keyValue[0], UTF_8);
            String value = keyValue.length > 1 ? URLDecoder.decode(keyValue[1], UTF_8) : "";

            queryParameters.put(key, value);
        }
    }

    // Header 처리
    private void parseHeaders(BufferedReader reader) throws IOException {
        String line;

        while (!(line = reader.readLine()).isEmpty()) {
            String[] headerParts = line.split(":");

            headers.put(headerParts[0].trim(), headerParts[1].trim());
        }
    }

    // 추가
    // 메시지 바디를 처리
    private void parseBody(BufferedReader reader) throws IOException {
        if (!headers.containsKey("Content-Length")) {
            return;
        }

        int contentLength = Integer.parseInt(headers.get("Content-Length"));
        char[] bodyChars = new char[contentLength];
        int read = reader.read(bodyChars);
        if (read != contentLength) {
            throw new IOException("Failed to read entire body. Expected " + contentLength + " bytes, but read " + read);
        }

        String body = new String(bodyChars);
        log("HTTP Message Body: " + body);

        String contentType = headers.get("Content-Type");
        if ("application/x-www-form-urlencoded".equals(contentType)) {
            parseQueryParameters(body);
        }
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getParameter(String name) {
        return queryParameters.get(name);
    }

    public String getHeader(String name) {
        return headers.get(name);
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", queryParameters=" + queryParameters +
                ", headers=" + headers +
                '}';
    }
}
