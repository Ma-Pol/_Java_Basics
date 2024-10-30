package kyh_4_advanced2.was.v6;

import kyh_4_advanced2.was.httpserver.HttpRequest;
import kyh_4_advanced2.was.httpserver.HttpResponse;

public class SearchControllerV6 {
    public void search(HttpRequest request, HttpResponse response) {
        String query = request.getParameter("q");

        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + query + "</li>");
        response.writeBody("</ul>");
    }
}
