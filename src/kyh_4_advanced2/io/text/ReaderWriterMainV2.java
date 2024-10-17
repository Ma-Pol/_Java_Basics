package kyh_4_advanced2.io.text;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;
import static kyh_4_advanced2.io.text.TextConst.FILE_NAME;

// String 입출력
// OutputStreamWriter, OutputStreamReader
public class ReaderWriterMainV2 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("writeString: " + writeString);

        // 파일에 쓰기
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);
        osw.write(writeString); // String을 직접 전달할 수 있다.
        osw.close();

        // 파일에서 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        InputStreamReader isr = new InputStreamReader(fis, UTF_8);

        StringBuilder content = new StringBuilder();
        int ch;
        while ((ch = isr.read()) != -1) {
            content.append((char) ch);
        }
        isr.close();

        System.out.println("readString: " + content);
    }
}
