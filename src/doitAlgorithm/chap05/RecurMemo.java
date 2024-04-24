package doitAlgorithm.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecurMemo {
    static String[] memo;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("정수를 입력하세요.: ");
            int x = Integer.parseInt(br.readLine());

            memo = new String[x + 2]; // -1, 0 값을 저장하기 위한 + 2 처리
            recur(x);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    static void recur(int n) {
        // 이미 해당 값을 출력한 적이 있는 n값인 경우, 메모된 값을 출력
        if (memo[n + 1] != null) {
            System.out.print(memo[n + 1]);
        }

        // 한 번도 출력한 적이 없는 n값인 경우, 출력값 계산 + 메모
        else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);

                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            }

            // recur(0), recur(-1)의 경우: 빈 문자열 저장
            else {
                memo[n + 1] = "";
            }
        }
    }
}
