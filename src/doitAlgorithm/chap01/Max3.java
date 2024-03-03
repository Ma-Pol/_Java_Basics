package doitAlgorithm.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b의 값: ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("c의 값: ");
        int c = Integer.parseInt(br.readLine());

        int max = Math.max(a, Math.max(b, c));

        System.out.printf("최댓값은 %d입니다.", max);

        br.close();
    }
}
