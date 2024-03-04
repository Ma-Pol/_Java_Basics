package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        System.out.println("숫자 피라미드를 출력합니다.");

        do {
            System.out.print("몇 단 피라미드입니까?: ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

        npira(n);

        br.close();
    }

    static void npira(int n) {
        for (int i = 1; i <= n; i++)
            System.out.println(" ".repeat(n - i)
                    + Integer.toString(i % 10).repeat((i - 1) * 2 + 1)
                    + " ".repeat(n - i));
    }
}
