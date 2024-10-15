package kyh_4_advanced2.examples.was.httpserver.servlet;

import kyh_4_advanced2.examples.was.httpserver.HttpRequest;
import kyh_4_advanced2.examples.was.httpserver.HttpResponse;
import kyh_4_advanced2.examples.was.httpserver.HttpServlet;

public class DiscardServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        // empty
    }
}
