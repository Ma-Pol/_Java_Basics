package kyh_4_advanced2.io.text;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;
import static kyh_4_advanced2.io.text.TextConst.FILE_NAME;

// String 입출력
// BufferedWriter, BufferedReader
public class ReaderWriterMainV4 {
    private static final int BuFFER_SIZE = 8192;

    public static void main(String[] args) throws IOException {
        String writeString = "ABC\n가나다\nHello, Java!";
        System.out.println("== Write String ==");
        System.out.println(writeString);

        // 파일에 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
        BufferedWriter bw = new BufferedWriter(fw, BuFFER_SIZE);
        bw.write(writeString);
        bw.close();

        // 파일에서 읽기
        StringBuilder content = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, UTF_8);
        BufferedReader br = new BufferedReader(fr, BuFFER_SIZE);

        String line;
        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }
        br.close();

        System.out.println("== Read String ==");
        System.out.print(content);
    }
}
