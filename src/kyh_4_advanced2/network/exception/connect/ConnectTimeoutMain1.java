package kyh_4_advanced2.network.exception.connect;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

// TCP 연결 타임아웃 - OS 기본
/*
 * [java.net.ConnectException: Operation timed out]: 연결 대기 타임아웃
 * - 해당 IP로 연결 패킷을 보내지만 IP를 사용하는 서버가 없으므로 TCP 응답이 없는 경우
 * - 또는 해당 서버가 바쁘거나 문제가 있어 연결 응답 패킷을 보내지 못하는 경우
 * - 이때, OS 별로 연결 대기 타임아웃이 설정되어 있다.
 *   - Windows: 약 21초
 *   - Linux: 약 75~180초
 *   - mac: 약 75초
 */
public class ConnectTimeoutMain1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        try {
            Socket socket = new Socket("192.168.1.250", 45678);
        } catch (ConnectException e) {
            // ConnectException: Operation timed out
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("end = " + (end - start));
    }
}
