package kyh_4_advanced2.network.exception.close.normal;

import java.io.*;
import java.net.Socket;

import static kyh_4_advanced2.util.MyLogger.log;

// 소켓 정상 종료 (클라이언트)
public class NormalCloseClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);
        InputStream input = socket.getInputStream();

        readByInputStream(input, socket); // 1byte 단위로 읽음
        readByBufferedReader(input, socket); // 라인 단위로 String으로 읽음
        readyByDataInputStream(input, socket); // DataInputStream으로 String 단위로 읽음

        log("연결 종료: " + socket.isClosed());
    }

    private static void readByInputStream(InputStream input, Socket socket) throws IOException {
        int read = input.read();
        log("read = " + read);
        if (read == -1) {
            input.close();
            socket.close();
        }
    }

    private static void readByBufferedReader(InputStream input, Socket socket) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(input));
        String readString = br.readLine();
        log("readString = " + readString);
        if (readString == null) {
            br.close();
            socket.close();
        }
    }

    private static void readyByDataInputStream(InputStream input, Socket socket) throws IOException {
        DataInputStream dis = new DataInputStream(input);
        try {
            dis.readUTF();
        } catch (EOFException e) {
            log(e);
        } finally {
            dis.close();
            socket.close();
        }
    }
}
