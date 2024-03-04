package doitAlgorithm.chap01.subChap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JudgeABC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력하세요. : ");
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println("A");
        } else if (n == 2) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        br.close();
    }
}
