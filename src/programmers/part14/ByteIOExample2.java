package programmers.part14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExample2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/programmers/part14/ByteIOExample2.java");
            fos = new FileOutputStream("src/programmers/part14/ByteIOExample2.txt");

            int readCount = -1;

            // 512 바이트 씩 읽어서 512 바이트 씩 쓰기
            byte[] buffer = new byte[512];

            while ((readCount = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, readCount);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("경과 시간 : " + (endTime - startTime) + "ms");
    }
}
