package kyh_4_advanced2.network.tcp.v6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static kyh_4_advanced2.network.tcp.SocketCloseUtil.closeAll;
import static kyh_4_advanced2.util.MyLogger.log;

public class SessionV6 implements Runnable {
    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final SessionManagerV6 sessionManager;
    private boolean closed = false;


    public SessionV6(Socket socket, SessionManagerV6 sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {
        // try-with-resources 사용 불가
        // 클라이언트 종료 시에는 finally 구문이 실행되지만
        // 서버 종료 시에는 close() 메서드만 호출되므로 finally 구문이 실행되지 않는다.
        // 따라서 자원 정리가 필요한 socket, input, output을 try 구문에 국한시킬 수 없다.
        try {
            while (true) {
                // 클라이언트로부터 문자 받기
                String received = input.readUTF();
                log("client -> server: " + received);

                if (received.equals("exit")) {
                    break;
                }

                // 클라이언트에게 문자 보내기
                String toSend = received + " World!";
                output.writeUTF(toSend);
                log("client <- server: " + toSend);
            }
        } catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
            close();
        }
    }

    // 세션 종료 시, 서버 종료 시 동시에 호출될 수 있다.
    public synchronized void close() {
        if (closed) {
            return;
        }

        closeAll(socket, input, output);
        closed = true;
        log("연결 종료: " + socket);
    }
}
