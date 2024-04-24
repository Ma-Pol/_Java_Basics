package doitAlgorithm.chap05;

import doitAlgorithm.chap04.IntStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecurX2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("정수를 입력하세요.: ");
            int x = Integer.parseInt(br.readLine());

            recur(x);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    // 비재귀적 메서드로 변경하기 2(재귀 완전히 제거)
    static void recur(int n) {
        IntStack stk = new IntStack(n);

        while (true) {
            if (n > 0) {
                stk.push(n);        // n값을 푸시
                n = n - 1;
                continue;
            }

            if (!stk.isEmpty()) {   // 스택이 비어있지 않으면 실행
                n = stk.pop();      // 저장하고 있던 스택값을 팝
                System.out.println(n);
                n = n - 2;
                continue;
            }

            break;
        }
    }
}
