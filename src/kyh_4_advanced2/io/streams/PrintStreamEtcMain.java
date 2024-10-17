package kyh_4_advanced2.io.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEtcMain {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("temp/print.txt");
        PrintStream printStream1 = new PrintStream(fos); // 파일 출력
        PrintStream printStream2 = new PrintStream(System.out); // 콘솔 출력

        // 파일에 쓰기
        printStream1.println("hello java!");
        printStream1.println(10);
        printStream1.println(true);
        printStream1.printf("hello %s", "world");
        printStream1.close();

        // 콘솔에 쓰기
        printStream2.println("hello java!");
        printStream2.println(10);
        printStream2.println(true);
        printStream2.printf("hello %s", "world");
        printStream2.close();
    }
}
