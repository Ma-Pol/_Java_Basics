package kyh_4_advanced2.webservice;

import kyh_4_advanced2.io.member.impl.FileMemberRepository;
import kyh_4_advanced2.was.httpserver.HttpServer;
import kyh_4_advanced2.was.httpserver.HttpServlet;
import kyh_4_advanced2.was.httpserver.ServletManager;
import kyh_4_advanced2.was.httpserver.servlet.DiscardServlet;
import kyh_4_advanced2.was.httpserver.servlet.annotation.AnnotationServletV3;

import java.io.IOException;
import java.util.List;

public class MemberServerMain {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        FileMemberRepository memberRepository = new FileMemberRepository();
        MemberController memberController = new MemberController(memberRepository);
        HttpServlet servlet = new AnnotationServletV3(List.of(memberController));

        ServletManager servletManager = new ServletManager();
        servletManager.add("/favicon.ico", new DiscardServlet());
        servletManager.setDefaultServlet(servlet);

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
