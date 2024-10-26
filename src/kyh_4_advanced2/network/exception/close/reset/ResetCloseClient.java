package kyh_4_advanced2.network.exception.close.reset;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

import static kyh_4_advanced2.util.MyLogger.log;

// 강제 종료 (클라이언트)
public class ResetCloseClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        // clinet <- server: FIN
        Thread.sleep(1000); // 서버가 close()를 호출할 때까지 잠시 대기

        // client -> server: PUSH[1]
        output.write(1);

        // client <- server: RST
        Thread.sleep(1000); // RST 메시지 전송 대기

        try {
            // java.net.SocketException: Connection reset (mac 기준)
            // java.net.SocketException: 현재 연결은 사용자의 호스트 시스템의 소프트웨어의 의해 중단되었습니다 (Windows 기준)
            int read = input.read();
            System.out.println("read = " + read);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            output.write(1);
        } catch (SocketException e) {
            // java.net.SocketException: Broken pipe (mac 기준)
            // java.net.SocketException: 현재 연결은 사용자의 호스트 시스템의 소프트웨어의 의해 중단되었습니다 (Windows 기준)
            e.printStackTrace();
        }
    }
}
