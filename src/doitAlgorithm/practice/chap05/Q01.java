package doitAlgorithm.practice.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("정수를 입력하세요.: ");
            int n = Integer.parseInt(br.readLine());

            System.out.printf("%d의 팩토리얼은 %d입니다.\n", n, factorial(n));
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    static int factorial(int n) {
        int fact = 1;

        while (n > 0)
            fact *= n--;

        return fact;
    }
}
