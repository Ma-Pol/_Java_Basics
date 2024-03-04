package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        System.out.println("정사각형을 출력합니다.");

        do {
            System.out.print("변의 길이: ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }

        br.close();
    }
}
