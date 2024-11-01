package kyh_4_advanced2.chat.server;

import java.io.IOException;
import java.util.List;

public class CommandManagerV2 implements CommandManager {
    private static final String DELIMITER = "[|]";
    private final SessionManager sessionManager;

    public CommandManagerV2(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String totalMessage, Session session) throws IOException {
        if (totalMessage.startsWith("/join")) {
            String username = totalMessage.split(DELIMITER)[1];
            session.setUsername(username);
            sessionManager.sendAll(username + " 님이 입장했습니다.");
            return;
        }

        if (totalMessage.startsWith("/message")) {
            // 클라이언트 전체에게 문자 보내기
            String message = totalMessage.split(DELIMITER)[1];
            sessionManager.sendAll("[" + session.getUsername() + "] " + message);
            return;
        }

        if (totalMessage.startsWith("/change")) {
            String changeName = totalMessage.split(DELIMITER)[1];
            sessionManager.sendAll(session.getUsername() + " 님이 " + changeName + " 로 이름을 변경했습니다.");
            session.setUsername(changeName);
            return;
        }

        if (totalMessage.startsWith("/users")) {
            List<String> usernames = sessionManager.getAllUsername();
            StringBuilder sb = new StringBuilder();

            sb.append("전체 접속자 수: ").append(usernames.size()).append("\n");
            for (String username : usernames) {
                sb.append(" - ").append(username).append("\n");
            }

            session.send(sb.toString());
            return;
        }

        if (totalMessage.startsWith("/exit")) {
            throw new IOException("exit");
        }

        session.send("처리할 수 없는 명령어입니다: " + totalMessage);
    }
}