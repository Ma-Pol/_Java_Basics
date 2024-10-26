package kyh_4_advanced2.network.exception.connect;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * [java.net.UnknownHostException]: 호스트를 알 수 없음
 *
 * [java.net.ConnectException: Connection refused]: 연결이 거부되었음
 * - 네트워크를 통해 해당 IP의 서버 컴퓨터에 접속은 성공했음
 * - 서버 컴퓨터가 해당 포트를 사용하지 않기 때문에 TCP 연결을 거부했음
 * - IP에 해당하는 서버는 켜져있지만, 사용하는 포트가 없을 때 주로 발생
 * - 네트워크 방화벽 등에서 무단 연결로 인지하고 연결을 막을 때도 발생
 * - 이때 서버 컴퓨터의 OS는 TCP RST(Reset)라는 패킷을 보내서 연결을 거부한다.
 * - 클라이언트가 연결 시도 중에 RST 패킷을 받으면 이 예외가 발생한다.
 */
public class ConnectMain {
    public static void main(String[] args) throws IOException {
        unknownHostEx1();
        unknownHostEx2();
        connectionRefused();
    }

    private static void unknownHostEx1() throws IOException {
        try {
            Socket socket = new Socket("999.999.999.999", 80);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private static void unknownHostEx2() throws IOException {
        try {
            Socket socket = new Socket("google.gogo", 80);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private static void connectionRefused() throws IOException {
        try {
            Socket socket = new Socket("localhost", 45678);// 미사용 포트
        } catch (ConnectException e) {
            // ConnectException: Connection refused
            e.printStackTrace();
        }
    }
}
