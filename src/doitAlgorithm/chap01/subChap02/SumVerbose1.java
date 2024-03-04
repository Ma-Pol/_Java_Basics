// 1, 2, ..., n의 합과 그 값을 구하는 과정을 출력(1)

package doitAlgorithm.chap01.subChap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumVerbose1 {
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

            if (i < n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
        }

        System.out.printf("%d", sum);


        br.close();
    }
}
