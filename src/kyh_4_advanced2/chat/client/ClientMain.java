package kyh_4_advanced2.chat.client;

import java.io.IOException;

public class ClientMain {
    private static final int PORT = 13579;

    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost", PORT);
        client.start();
    }
}
