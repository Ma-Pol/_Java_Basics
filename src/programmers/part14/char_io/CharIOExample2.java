package programmers.part14.char_io;

import java.io.*;

public class CharIOExample2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("src/programmers/part14/char_io/CharIOExample2.java"));
            pw = new PrintWriter(new FileWriter("src/programmers/part14/char_io/CharIOExample2.txt"));
            // pw = new PrintWriter("src/programmers/part14/char_io/CharIOExample2.txt"); // 이렇게도 가능

            String line = null;

            while ((line = br.readLine()) != null) { // File 끝에서 null을 리턴하기 때문
                pw.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
