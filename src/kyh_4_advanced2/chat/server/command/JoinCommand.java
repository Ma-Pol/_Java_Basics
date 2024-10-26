package kyh_4_advanced2.chat.server.command;

import kyh_4_advanced2.chat.server.Session;
import kyh_4_advanced2.chat.server.SessionManager;

import java.io.IOException;

public class JoinCommand implements Command {
    private final SessionManager sessionManager;

    public JoinCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) throws IOException {
        String username = args[1];
        session.setUsername(username);
        sessionManager.sendAll(username + " 님이 입장했습니다.");
    }
}
