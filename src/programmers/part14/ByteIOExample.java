package programmers.part14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExample {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 파일이 없을 경우 FileNotFoundException 발생
            fis = new FileInputStream("src/programmers/part14/ByteIOExample.java"); // 파일 읽기 객체
            fos = new FileOutputStream("src/programmers/part14/ByteIOExample.txt"); // 파일 쓰기 객체

            int readData = -1;

            // 파일의 끝에 도달하면 -1을 반환
            while ((readData = fis.read()) != -1) {
                fos.write(readData); // 파일 쓰기
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            // FileInputStream, FileOutputStream 객체는 반드시 닫아주어야 한다.
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
