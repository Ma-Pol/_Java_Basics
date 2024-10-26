package kyh_4_advanced2.chat.server.command;

import kyh_4_advanced2.chat.server.Session;

import java.io.IOException;

public class ExitCommand implements Command {
    @Override
    public void execute(String[] args, Session session) throws IOException {
        throw new IOException("exit");
    }
}
