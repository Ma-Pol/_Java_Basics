package kyh_4_advanced2.network.exception.connect;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// TCP 소켓 타임아웃 - read 타임아웃 (서버)
public class SocketTimeoutServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();

        Thread.sleep(1_000_000); // 서버의 무응답 상황을 가정
    }
}
