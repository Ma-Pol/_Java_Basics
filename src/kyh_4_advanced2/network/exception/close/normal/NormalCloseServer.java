package kyh_4_advanced2.network.exception.close.normal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static kyh_4_advanced2.util.MyLogger.log;

// 소켓 정상 종료 (서버)
/*
 * 소켓 연결 1초 뒤, socket.close() 수행
 * 1. 서버에서 socket.close()를 호출하면 클라이언트에 FIN 패킷을 보낸다.
 * 2. 클라이언트는 FIN 패킷을 받는다.
 * 3. 서버가 소켓을 종료했다는 의미이므로 클라이언트는 더는 읽을 데이터가 없다.
 * 4. FIN 패킷을 받은 클라이언트의 소켓은 -1(EOF)을 반환한다.
 *   - InputStream.read(): -1 반환
 *   - BufferedReader.readLine(): null 반환
 *   - DataInputStream.readUTF(): java.io.EOFException 반환
 */
public class NormalCloseServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept(); // 블로킹
        log("소켓 연결: " + socket);

        Thread.sleep(1000);
        socket.close();
        log("소켓 종료");
    }
}
