package kyh_4_advanced2.network.tcp.v3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static kyh_4_advanced2.util.MyLogger.log;

// 각 클라이언트의 요청을 스레드로 처리
// main 스레드: 서버 소켓을 생성하며, accept()를 반복 호출
// Session 담당 스레드: 자신의 소켓과 연결된 클라이언트와의 메세지 처리 반복
public class ServerV3 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        while (true) {
            Socket socket = serverSocket.accept(); // 블로킹
            log("소켓 연결: " + socket);

            SessionV3 session = new SessionV3(socket);
            Thread thread = new Thread(session);
            thread.start();
        }
    }
}
