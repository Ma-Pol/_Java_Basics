package kyh_4_advanced2.network.ex;

import java.util.ArrayList;
import java.util.List;

public class ChatSessionManager {
    private List<ChatSession> sessions = new ArrayList<>();

    public synchronized void add(ChatSession session) {
        sessions.add(session);
    }

    public synchronized void spreadJoinMessage(String userName) {
        for (ChatSession session : sessions) {
            session.receiveJoinMessage(userName);
        }
    }

    public synchronized void spreadMessage(String userName, String message) {
        for (ChatSession session : sessions) {
            session.receiveMessage(userName, message);
        }
    }

    public synchronized void spreadExitMessage(String userName) {
        for (ChatSession session : sessions) {
            session.receiveExitMessage(userName);
        }
    }

    public synchronized String getUsers() {
        StringBuilder sb = new StringBuilder("== 전체 사용자 목록 ==\n");
        for (int i = 0; i < sessions.size(); i++) {
            sb.append(sessions.get(i));
            if (i != sessions.size() - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public synchronized void remove(ChatSession session) {
        sessions.remove(session);
    }

    public synchronized void closeAll() {
        for (ChatSession session : sessions) {
            session.close();
        }
        sessions.clear();
    }
}
