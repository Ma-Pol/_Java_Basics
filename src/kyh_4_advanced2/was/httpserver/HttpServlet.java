package kyh_4_advanced2.was.httpserver;

import java.io.IOException;

// Servlet: Server + Applet의 줄임말(Http 서버에서 실행되는 작은 자바 프로그램)
public interface HttpServlet {
    void service(HttpRequest request, HttpResponse response) throws IOException;
}
