package doitAlgorithm.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recur {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("정수를 입력하세요.: ");
            int x = Integer.parseInt(br.readLine());

            recur(x);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    /*
     * 상향식 분석
     *
     * recur(4)
     *   recur(3)
     *       recur(2)
     *           recur(1)
     *               recur(0)    // 작동하지 않음
     *               1출력
     *               recur(-1)   // 작동하지 않음
     *           2 출력
     *           recur(0)        // 작동하지 않음
     *       3 출력
     *       recur(1)
     *           recur(0)        // 작동하지 않음
     *           1 출력
     *           recur(-1)       // 작동하지 않음
     *   4 출력
     *   recur(2)
     *       recur(1)
     *           recur(0)        // 작동하지 않음
     *           1 출력
     *           recur(-1)       // 작동하지 않음
     *       2 출력
     *       recur(0)            // 작동하지 않음
     *
     * 결과: 1 2 3 1 4 1 2 출력
     *
     *
     * 하향식 분석
     *
     * recur(1) : recur(0) / 1 출력 / recur(-1) == 1 출력
     * recur(2) : recur(1) / 2 출력 / recur(0) == 1 2 출력
     * recur(3) : recur(2) / 3 출력 / recur(1) == 1 2 3 1 출력
     * recur(4) : recur(3) / 4 출력 / recur(2) == 1 2 3 1 4 1 2 출력
     */
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }
}
