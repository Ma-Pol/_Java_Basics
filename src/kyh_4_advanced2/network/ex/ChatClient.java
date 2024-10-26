package kyh_4_advanced2.network.ex;

import java.io.*;
import java.net.Socket;

import static kyh_4_advanced2.util.MyLogger.log;

public class ChatClient {
    private static final int PORT = 50001;

    public static void main(String[] args) throws IOException {
        try (
                Socket socket = new Socket("localhost", PORT);
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            ClientInputTask inputTask = new ClientInputTask(socket, input);
            Thread inputThread = new Thread(inputTask, "input");
            inputThread.start();

            System.out.println("== 채팅 프로그램 실행 ==");
            System.out.println("채팅 프로그램에서 사용할 이름을 입력하세요.");
            System.out.println("예시: /join|홍길동");

            while (true) {
                String toSend = br.readLine();

                output.writeUTF(toSend);

                if (toSend.equals("/exit")) {
                    System.out.println("채팅 연결을 해제합니다.");
                    break;
                }
            }
        } catch (IOException e) {
            log(e);
        }
    }

    private static class ClientInputTask implements Runnable {
        private final Socket socket;
        private final DataInputStream input;

        public ClientInputTask(Socket socket, DataInputStream input) {
            this.socket = socket;
            this.input = input;
        }

        @Override
        public void run() {
            try (
                    socket; input;
            ) {
                while (true) {
                    System.out.println(input.readUTF());
                }
            } catch (IOException e) {
                log(e);
            }
        }
    }
}
