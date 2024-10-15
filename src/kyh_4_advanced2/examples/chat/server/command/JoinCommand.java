package kyh_4_advanced2.examples.chat.server.command;

import kyh_4_advanced2.examples.chat.server.Session;
import kyh_4_advanced2.examples.chat.server.SessionManager;

public class JoinCommand implements Command {

    private final SessionManager sessionManager;

    public JoinCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) {
        String username = args[1];
        session.setUsername(username);
        sessionManager.sendAll(username + "님이 입장했습니다.");
    }
}
