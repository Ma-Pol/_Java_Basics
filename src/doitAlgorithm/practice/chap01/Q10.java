package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력하세요: ");
        int n = Integer.parseInt(br.readLine());
        int length = 0;

        while (n > 0) {
            n /= 10;
            length++;
        }

        System.out.printf("그 수는 %d자리입니다.", length);

        br.close();
    }
}
