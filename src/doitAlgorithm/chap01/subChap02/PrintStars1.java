// *를 n개 출력하되 w개마다 줄 바꿈(1)

package doitAlgorithm.chap01.subChap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStars1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, w;

        System.out.println("*를 n개 출력하되, w개마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.print("n의 값: ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

        do {
            System.out.print("w의 값: ");
            w = Integer.parseInt(br.readLine());
        } while (w <= 0 || w > n);

        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            if (i % w == 0 && i != n) System.out.println();
        }

        br.close();
    }
}
