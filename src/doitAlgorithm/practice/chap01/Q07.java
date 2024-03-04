package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값: ");
        int n = Integer.parseInt(br.readLine());

        int sum = (1 + n) * (n / 2);

        if (n % 2 == 1) {
            sum += (n / 2) + 1;
        }

        System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);

        br.close();
    }
}
