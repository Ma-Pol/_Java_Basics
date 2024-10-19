package kyh_4_advanced2.io.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMainV1 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("temp/copy.dat");
        FileOutputStream fos = new FileOutputStream("temp/copy_new.dat");

        // FileInputStream으로 복사 대상 파일의 데이터를 불러온 뒤
        // FileOutputStream으로 동일 데이터의 파일을 생성, 출력한다.
        byte[] bytes = fis.readAllBytes();
        fos.write(bytes);
        fis.close();
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
