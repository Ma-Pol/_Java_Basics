package kyh_4_advanced2.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static kyh_4_advanced2.io.buffered.BufferedConst.*;

// BufferedOutputStream으로 간편하게 버퍼를 사용해 쓰기
public class CreateFileV3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        // BufferedOutputStream: 내부에서 버퍼 기능만을 제공한다.
        // 따라서 반드시 대상 OutputStream 구현 객체가 있어야 한다.
        BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i++) {
            bos.write(1);
        }

        bos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
