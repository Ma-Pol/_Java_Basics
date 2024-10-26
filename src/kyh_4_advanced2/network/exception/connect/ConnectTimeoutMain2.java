package kyh_4_advanced2.network.exception.connect;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

// TCP 연결 타임아웃 - 직접 설정
public class ConnectTimeoutMain2 {
    public static void main(String[] args) throws IOException {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("192.168.1.250", 45678), 1000);
        } catch (SocketTimeoutException e) {
            // java.net.SocketTimeoutException: Connect timed out
            e.printStackTrace();
        }
    }
}
