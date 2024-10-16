package kyh_4_advanced2.io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static kyh_4_advanced2.io.buffered.BufferedConst.FILE_NAME;
import static kyh_4_advanced2.io.buffered.BufferedConst.FILE_SIZE;

// 1byte씩 쓰기
public class CreateFileV1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        // 10MB 파일 생성
        for (int i = 0; i < FILE_SIZE; i++) {
            fos.write(1);
        }
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
