package kyh_4_advanced2.was.httpserver.servlet;

import kyh_4_advanced2.was.httpserver.HttpRequest;
import kyh_4_advanced2.was.httpserver.HttpResponse;
import kyh_4_advanced2.was.httpserver.HttpServlet;

import java.io.IOException;

public class NotFoundServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.setStatusCode(404);
        response.writeBody("<h1>404 페이지를 찾을 수 없습니다.</h1>");
    }
}