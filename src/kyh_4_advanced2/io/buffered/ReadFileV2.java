package kyh_4_advanced2.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static kyh_4_advanced2.io.buffered.BufferedConst.BUFFER_SIZE;
import static kyh_4_advanced2.io.buffered.BufferedConst.FILE_NAME;

// 버퍼 사이즈만큼씩 읽기
public class ReadFileV2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE]; // 8KB 사이즈
        int fileSize = 0;
        int size;
        while ((size = fis.read(buffer)) != -1) {
            fileSize += size;
        }
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File name: " + FILE_NAME);
        System.out.println("File size: " + (fileSize / 1024 / 1024) + "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
