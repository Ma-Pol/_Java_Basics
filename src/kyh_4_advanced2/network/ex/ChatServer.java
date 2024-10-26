package kyh_4_advanced2.network.ex;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static kyh_4_advanced2.util.MyLogger.log;

public class ChatServer {
    private static final int PORT = 50001;

    public static void main(String[] args) throws IOException {
        log("서버 시작");
        ChatSessionManager sessionManager = new ChatSessionManager();
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        ShutdownHook shutdownHook = new ShutdownHook(serverSocket, sessionManager);
        Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook, "shutdown"));

        try {
            while (true) {
                Socket socket = serverSocket.accept();
                log("소켓 연결: " + socket);

                ChatSession session = new ChatSession(socket, sessionManager);
                Thread thread = new Thread(session);
                thread.start();
            }
        } catch (IOException e) {
            log("서버 소켓 종료: " + e);
        }

    }

    private static class ShutdownHook implements Runnable {
        private final ServerSocket serverSocket;
        private final ChatSessionManager sessionManager;

        public ShutdownHook(ServerSocket serverSocket, ChatSessionManager sessionManager) {
            this.serverSocket = serverSocket;
            this.sessionManager = sessionManager;
        }

        @Override
        public void run() {
            log("shutdownHook 실행");
            try {
                sessionManager.closeAll();
                serverSocket.close();

                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("e = " + e);
            }
        }
    }
}
