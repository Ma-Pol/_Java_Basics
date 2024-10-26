package kyh_4_advanced2.chat.server.command;

import kyh_4_advanced2.chat.server.Session;

import java.io.IOException;

public interface Command {
    void execute(String[] args, Session session) throws IOException;
}
