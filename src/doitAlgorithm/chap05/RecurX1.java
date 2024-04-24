package doitAlgorithm.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecurX1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("정수를 입력하세요.: ");
            int x = Integer.parseInt(br.readLine());

            recur(x);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    // 비재귀적 메서드로 변경하기 1
    static void recur(int n) {
        while (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }
}
