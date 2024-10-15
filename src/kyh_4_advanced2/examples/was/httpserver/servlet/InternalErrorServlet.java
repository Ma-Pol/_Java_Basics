package kyh_4_advanced2.examples.was.httpserver.servlet;

import kyh_4_advanced2.examples.was.httpserver.HttpRequest;
import kyh_4_advanced2.examples.was.httpserver.HttpResponse;
import kyh_4_advanced2.examples.was.httpserver.HttpServlet;

public class InternalErrorServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        response.setStatusCode(500);
        response.writeBody("<h1>Internal Error</h1>");
    }
}
