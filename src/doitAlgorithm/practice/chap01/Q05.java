package doitAlgorithm.practice.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
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

    // 해당 메서드가 Q04의 med3 메서드에 비해 효율이 떨어지는 이유
    // 경우에 따라서는 불필요한 비교를 하게 되기 때문?
    static int med3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        return c;
    }
}
