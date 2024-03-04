// 양수만 입력하여 1, 2, ..., n의 합을 구함

package doitAlgorithm.chap01.subChap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFor2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n의 값: ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);

        br.close();
    }
}
