package kyh_4_advanced2.network.exception.close.reset;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static kyh_4_advanced2.util.MyLogger.log;

// 강제 종료 (서버)
/*
 * 서버는 종료를 위해 socket.close() 호출
 * 1. 서버는 클라이언트에 FIN 패킷을 전달
 * 2. 클라이언트는 FIN 패킷을 받는다.
 * 3. 클라이언트의 OS에서 FIN에 대한 ACK 패킷을 서버에 전달한다.
 * 4. 그런데 그 즉시, 클라이언트는 output.write(1)를 통해 서버에 메시지를 전달한다.
 * 5. 데이터를 전송하는 FUSH 패킷이 서버에 전달된다.
 * 6. 서버는 이미 FIN으로 종료를 요청했는데, PUSH 패킷이 전송되었다.
 * 7. 서버는 TCP 연결에 문제가 있다고 판단, 즉각 연결 종료를 요청하는 RST 패킷을 클라이언트에 전달한다.
 * 8. 클라이언트는 RST 패킷을 받은 뒤, read()/write() 수행 시에 특정 예외를 발생시킨다.
 */
public class ResetCloseServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        log("소켓 연결: " + socket);

        socket.close();
        serverSocket.close();
        log("소켓 종료");
    }
}
