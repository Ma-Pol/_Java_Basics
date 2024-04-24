package doitAlgorithm.practice.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("정수를 입력하세요.: ");
            int x = Integer.parseInt(br.readLine());

            recur2(x);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    /*
     * 하향식 분석
     *
     * recur2(1) : recur2(-1) / 1 출력 / recur2(0) == 1 출력
     * recur2(2) : recur2(0) / 2 출력 / recur2(1) == 2 1 출력
     * recur2(3) : recur2(1) / 3 출력 / recur2(2) == 1 3 2 1 출력
     * recur2(4) : recur2(2) / 4 출력 / recur2(3) == 2 1 4 1 3 2 1 출력
     *
     *
     * 상향식 분석
     *
     * recur2(4)
     *      recur2(2)
     *          recur2(0)           // 작동하지 않음
     *          2 출력
     *          recur2(1)
     *              recur2(-1)      // 작동하지 않음
     *              1 출력
     *              recur2(0)       // 작동하지 않음
     *      4 출력
     *      recur2(3)
     *          recur2(1)
     *              recur2(-1)      // 작동하지 않음
     *              1 출력
     *              recur2(0)       // 작동하지 않음
     *          3 출력
     *          recur2(2)
     *              recur2(0)       // 작동하지 않음
     *              2 출력
     *              recur2(1)
     *                  recur2(-1)  // 작동하지 않음
     *                  1 출력
     *                  recur2(0)   // 작동하지 않음
     *
     * 결과: 2 1 4 1 3 2 1 출력
     */

    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }
}
