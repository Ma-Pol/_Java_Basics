package programmers.part14;

import java.io.*;

public class ByteIOExample3 {
    public static void main(String[] args) {
        // try-with-resources
        // try() 안에 선언된 객체는 try문이 종료되면 자동으로 close() 메서드가 호출된다.
        try (
                DataOutputStream out = new DataOutputStream(new FileOutputStream("src/programmers/part14/ByteIOExample3.txt"));
        ) {
            out.writeInt(100);
            out.writeBoolean(true);
            out.writeDouble(50.5);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
