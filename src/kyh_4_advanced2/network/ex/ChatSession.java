package kyh_4_advanced2.network.ex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static kyh_4_advanced2.network.tcp.SocketCloseUtil.closeAll;
import static kyh_4_advanced2.util.MyLogger.log;

public class ChatSession implements Runnable {
    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final ChatSessionManager sessionManager;
    private boolean connected = false;
    private boolean closed = false;

    private String userName;

    public ChatSession(Socket socket, ChatSessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {
        try {
            while (true) {
                String received = input.readUTF();

                if (!connected && received.startsWith("/join|")) {
                    userName = received.split("[|]")[1];
                    connected = true;

                    sessionManager.spreadJoinMessage(userName);

                    continue;
                }

                if (!connected) {
                    output.writeUTF("다시 입력하세요.");
                    continue;
                }

                // 이 아래 명령어는 /join 수행 후에 접근 가능
                if (received.equals("/exit")) {
                    sessionManager.spreadExitMessage(userName);
                    break;
                }

                if (received.startsWith("/message|")) {
                    String message = received.split("[|]")[1];
                    sessionManager.spreadMessage(userName, message);
                    continue;
                }

                if (received.startsWith("/change|")) {
                    userName = received.split("[|]")[1];
                    continue;
                }

                if (received.equals("/users")) {
                    String users = sessionManager.getUsers();
                    output.writeUTF(users);
                    continue;
                }

                // 여기까지 왔다면 유저가 올바른 명령어를 입력하지 않은 것
                output.writeUTF("잘못된 명령어입니다.");
            }
        } catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
            close();
        }
    }

    public void receiveJoinMessage(String userName) {
        try {
            output.writeUTF(userName + " 님이 접속했습니다.");
        } catch (IOException e) {
            log(e);
        }
    }

    public void receiveMessage(String userName, String message) {
        try {
            output.writeUTF("[" + userName + "] " + message);
        } catch (IOException e) {
            log(e);
        }
    }

    public void receiveExitMessage(String userName) {
        try {
            output.writeUTF(userName + " 님이 퇴장했습니다.");
        } catch (IOException e) {
            log(e);
        }
    }

    public String getUserName() {
        return userName;
    }

    public synchronized void close() {
        if (closed) {
            return;
        }

        closeAll(socket, input, output);
        closed = true;
        log("연결 종료: " + socket);
    }
}
