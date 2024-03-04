package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i++;
        }

        System.out.printf("1부터 %d까지의 합은 %d입니다.\n", n, sum);
        System.out.printf("i의 값은 %d입니다.", i);

        br.close();
    }
}
