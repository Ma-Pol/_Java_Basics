package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a의 값: ");
        int a = Integer.parseInt(br.readLine());
        int b = 0;

        while(true) {
            System.out.print("b의 값: ");
            b = Integer.parseInt(br.readLine());

            if (b > a) break;

            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.printf("b - a는 %d입니다.", b - a);

        br.close();
    }
}
