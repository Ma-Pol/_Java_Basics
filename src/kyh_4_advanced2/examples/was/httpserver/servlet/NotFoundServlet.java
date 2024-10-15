package kyh_4_advanced2.examples.was.httpserver.servlet;

import kyh_4_advanced2.examples.was.httpserver.HttpRequest;
import kyh_4_advanced2.examples.was.httpserver.HttpResponse;
import kyh_4_advanced2.examples.was.httpserver.HttpServlet;

public class NotFoundServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        response.setStatusCode(404);
        response.writeBody("<h1>404 페이지를 찾을 수 없습니다.</h1>");
    }
}
