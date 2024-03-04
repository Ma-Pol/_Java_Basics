package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수 a, b 사이의 모든 정수의 합을 구합니다.");
        System.out.print("a의 값: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b의 값: ");
        int b = Integer.parseInt(br.readLine());

        int sum = sumOf(a, b);

        System.out.printf("%d부터 %d까지의 합은 %d입니다.", a, b, sum);

        br.close();
    }

    static int sumOf(int a, int b) {
        int minValue = Math.min(a, b);
        int maxValue = Math.max(a, b);

        int sum = (minValue + maxValue) * (maxValue - minValue + 1) / 2;

        return sum;
    }
}
