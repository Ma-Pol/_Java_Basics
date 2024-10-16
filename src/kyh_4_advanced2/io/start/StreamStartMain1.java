package kyh_4_advanced2.io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain1 {
    public static void main(String[] args) throws IOException {
        // new FileOutputStream("temp/hello.dat", append 옵션);
        // append
        //  true인 경우, 기존 파일의 끝에 이어서 작성한다.
        //  false인 경우, 기존 파일의 데이터를 지우고 처음부터 다시 쓴다.(기본값)
        FileOutputStream fos = new FileOutputStream("temp/hello.dat", false);
        fos.write(65); // A
        fos.write(66); // B
        fos.write(67); // C
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read()); // 파일의 끝(EOF, End of File): -1
        fis.close();
    }
}
