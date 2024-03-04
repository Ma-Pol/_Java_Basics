// 3개의 정숫값을 입력하고 중앙값을 구하여 출력

package doitAlgorithm.chap01.subChap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Median {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b의 값: ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("c의 값: ");
        int c = Integer.parseInt(br.readLine());

        int med = med3(a, b, c);

        System.out.printf("중앙값은 %d입니다.", med);

        br.close();
    }

    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    static int med3Mine(int a, int b, int c) {
        return a + b + c - Math.min(a, Math.min(b, c)) - Math.max(a, Math.max(b, c));
    }
}
