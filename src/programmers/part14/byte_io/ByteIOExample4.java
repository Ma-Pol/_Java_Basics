package programmers.part14.byte_io;

import java.io.*;

public class ByteIOExample4 {
    public static void main(String[] args) {
        try (
                DataInputStream in = new DataInputStream(new FileInputStream("src/programmers/part14/byte_io/ByteIOExample3.txt"));
        ) {
            int i = in.readInt();
            boolean b = in.readBoolean();
            double d = in.readDouble();

            System.out.println(i); // 100
            System.out.println(b); // true
            System.out.println(d); // 50.5

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
