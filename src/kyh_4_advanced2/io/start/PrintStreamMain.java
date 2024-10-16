package kyh_4_advanced2.io.start;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMain {
    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;

        byte[] bytes = "Hello!\n".getBytes("UTF-8");
        printStream.write(bytes); // System.out.write()와 같음(OutputStream 제공)
        printStream.println("Print!"); // System.out.println()과 같음(PrintStream 제공)
    }
}
