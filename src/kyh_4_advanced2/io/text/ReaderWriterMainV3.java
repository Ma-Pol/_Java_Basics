package kyh_4_advanced2.io.text;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;
import static kyh_4_advanced2.io.text.TextConst.FILE_NAME;

// String 입출력
// FileWriter, FileReader
public class ReaderWriterMainV3 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("writeString: " + writeString);

        // 파일에 쓰기
        // FileWriter: 내부에서 FileOutputStream을 생성해서 사용한다.
        FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
        fw.write(writeString);
        fw.close();

        // 파일에서 읽기
        // FileReader: 내부에서 FileInputStream을 생성해서 사용한다.
        StringBuilder content = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, UTF_8);
        int ch;
        while ((ch = fr.read()) != -1) {
            content.append((char) ch);
        }
        fr.close();

        System.out.println("readString: " + content);
    }
}
