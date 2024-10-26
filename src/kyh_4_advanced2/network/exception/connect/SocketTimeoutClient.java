package kyh_4_advanced2.network.exception.connect;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

// TCP 소켓 타임아웃 - read 타임아웃 (클라이언트)
/*
 * [java.net.SocketTimeoutException: Read timed out]: 응답 대기 타임아웃
 */
public class SocketTimeoutClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        InputStream input = socket.getInputStream();

        try {
            socket.setSoTimeout(3000); // 타임아웃 시간 설정
            int read = input.read(); // 기본 설정은 무한 대기
            System.out.println("read = " + read);
        } catch (Exception e) {
            e.printStackTrace();
        }

        socket.close();
    }
}
