package doitAlgorithm.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EuclidGCD {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("두 정수의 최대공약수를 구합니다.");

            System.out.print("정수를 입력하세요.: ");
            int x = Integer.parseInt(br.readLine());

            System.out.print("정수를 입력하세요.: ");
            int y = Integer.parseInt(br.readLine());

            System.out.printf("최대공약수는 %d입니다.\n", gcd(x, y));
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    static int gcd(int x, int y) {
        if (y == 0)
            return x;

        return gcd(y, x % y);
    }
}
