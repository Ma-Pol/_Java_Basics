// 1, 2, ..., n의 합과 그 값을 구하는 과정을 출력(2)

package doitAlgorithm.chap01.subChap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumVerbose2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1부터 n까지의 합을 구합니다.");
        int n = 0;

        do {
            System.out.print("n의 값: ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }

//        System.out.print(n + " = ");
//        sum += n;
//        System.out.print(sum);

        System.out.print(n + " = " + (sum += n));

        br.close();
    }
}
