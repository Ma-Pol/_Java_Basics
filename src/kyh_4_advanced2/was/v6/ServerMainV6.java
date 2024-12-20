package kyh_4_advanced2.was.v6;

import kyh_4_advanced2.was.httpserver.HttpServer;
import kyh_4_advanced2.was.httpserver.HttpServlet;
import kyh_4_advanced2.was.httpserver.ServletManager;
import kyh_4_advanced2.was.httpserver.servlet.DiscardServlet;
import kyh_4_advanced2.was.httpserver.servlet.reflection.ReflectionServlet;
import kyh_4_advanced2.was.v5.servlet.HomeServlet;

import java.io.IOException;
import java.util.List;

public class ServerMainV6 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        List<Object> controllers = List.of(new SiteControllerV6(), new SearchControllerV6());
        HttpServlet reflectionServlet = new ReflectionServlet(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(reflectionServlet);
        servletManager.add("/", new HomeServlet());
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
