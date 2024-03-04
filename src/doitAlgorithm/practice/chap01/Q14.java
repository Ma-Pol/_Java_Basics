package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

        triangleLB(n);

        br.close();
    }

    static void triangleLB(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("*".repeat(i + 1));
    }

    static void triangleLU(int n) {
        for (int i = n; i > 0; i--)
            System.out.println("*".repeat(i));
    }

    static void triangleRB(int n) {
        for (int i = n - 1; i >= 0; i--)
            System.out.println(" ".repeat(i) + "*".repeat(n - i));
    }

    static void triangleRU(int n) {
        for (int i = 0; i < n; i++)
            System.out.println(" ".repeat(i) + "*".repeat(n - i));
    }
}
