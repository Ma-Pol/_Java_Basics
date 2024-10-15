package kyh_4_advanced2.examples.was.v5.servlet;

import kyh_4_advanced2.examples.was.httpserver.HttpRequest;
import kyh_4_advanced2.examples.was.httpserver.HttpResponse;
import kyh_4_advanced2.examples.was.httpserver.HttpServlet;

public class SearchServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) {
        String query = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + query + "</li>");
        response.writeBody("</ul>");
    }
}