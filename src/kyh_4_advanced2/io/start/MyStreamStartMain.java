package kyh_4_advanced2.io.start;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class MyStreamStartMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream fos = new FileOutputStream("temp/MyTest.txt");

        System.out.print("텍스트 파일에 입력할 데이터: ");
        String txt = br.readLine();
        fos.write(txt.getBytes(UTF_8));
        fos.close();

        InputStream fis = new FileInputStream("temp/MyTest.txt");
        byte[] data = fis.readAllBytes();
        System.out.println(new String(data, UTF_8));
        fis.close();

        br.close();
    }
}
