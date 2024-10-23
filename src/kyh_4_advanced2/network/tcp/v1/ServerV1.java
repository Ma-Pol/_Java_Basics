package kyh_4_advanced2.network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static kyh_4_advanced2.util.MyLogger.log;

// 서버를 우선 가동시켜야 한다. -> TCP 3-Way handshake
public class ServerV1 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");
        // ServerSocket: 클라이언트와 서버의 TCP 연결만 지원하는 특별한 소켓
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        // 실제 클라이언트와 서버가 정보를 주고 받으려면 Socket 객체가 필요
        // accept(): TCP 연결 정보를 기반으로 Socket 객체를 만들어 반환
        //           TCP 연결 정보가 없다면, 정보가 생성될 때까지 대기(블로킹)
        Socket socket = serverSocket.accept();
        log("소켓 연결(server): " + socket);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        // 클라이언트로부터 문자 받기
        String received = input.readUTF();
        log("client -> server: " + received);

        // 클라이언트에게 문자 보내기
        String toSend = received + " World!";
        output.writeUTF(toSend);
        log("client <- server: " + toSend);

        // 자원 정리
        log("연결 종료: " + socket);
        input.close();
        output.close();
        socket.close();
        serverSocket.close();
    }
}
