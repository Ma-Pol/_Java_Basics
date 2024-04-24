package doitAlgorithm.practice.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
    static String[] memo;

    static int countRecur;
    static int countRecurMemo;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("정수를 입력하세요.: ");
            int x = Integer.parseInt(br.readLine());

            int select;

            while (true) {
                System.out.print("(1) recur   (2) recurMemo\n사용할 메서드를 선택하세요.: ");
                select = Integer.parseInt(br.readLine());

                if (select == 1 || select == 2) break;

                System.out.println("다시 입력해주세요.");
            }

            if (select == 1) {
                countRecur = 0;
                recur(x);
            } else {
                memo = new String[x + 2];
                countRecurMemo = 0;
                recurMemo(x);
            }

            System.out.printf("메서드 호출 횟수: %d\n", select == 1 ? countRecur : countRecurMemo);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    static void recur(int n) {
        countRecur++;

        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    static void recurMemo(int n) {
        countRecurMemo++;

        if (memo[n + 1] != null) {
            System.out.print(memo[n + 1]);
        } else {
            if (n > 0) {
                recurMemo(n - 1);
                System.out.println(n);
                recurMemo(n - 2);

                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            } else {
                memo[n + 1] = "";
            }
        }
    }
}
