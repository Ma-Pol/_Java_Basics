package kyh_4_advanced2.examples.was.v5.servlet;

import kyh_4_advanced2.examples.was.httpserver.HttpRequest;
import kyh_4_advanced2.examples.was.httpserver.HttpResponse;
import kyh_4_advanced2.examples.was.httpserver.HttpServlet;

public class Site2Servlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        response.writeBody("<h1>site2</h1>");
    }
}
