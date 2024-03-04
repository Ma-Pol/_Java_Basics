package doitAlgorithm.chap01.subChap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleLB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        // 다른 방법
        for (int i = 1; i <= n; i++)
            System.out.println("*".repeat(i));


        br.close();
    }
}
