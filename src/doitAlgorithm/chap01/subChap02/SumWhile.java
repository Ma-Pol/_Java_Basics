// while 문으로 1, 2, ..., n의 합을 구함

package doitAlgorithm.chap01.subChap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumWhile {
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

        System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);

        br.close();
    }
}
