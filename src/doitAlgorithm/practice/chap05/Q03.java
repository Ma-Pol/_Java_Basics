package doitAlgorithm.practice.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("최대공약수를 구할 정수의 개수(2 이상): ");
            int nums;

            do {
                nums = Integer.parseInt(br.readLine());
            } while (nums < 2); // 둘 이상의 수를 입력받도록 한다.

            System.out.println();
            int[] arr = new int[nums];

            for (int i = 0; i < nums; i++) { // 최대공약수를 구할 정수를 입력받도록 한다.
                System.out.printf("%d번째 수: ", i + 1);
                arr[i] = Integer.parseInt(br.readLine());
            }

            System.out.printf("최대공약수는 %d입니다.\n", gcdArray(arr));

        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    // 정수 배열 내 모든 요소의 최대공약수를 구하는 메서드
    static int gcdArray(int[] arr) {
        int gcd = arr[0];
        int x, y;

        for (int i = 1; i < arr.length; i++) {
            x = gcd;
            y = arr[i];

            while (y != 0) {
                int temp = x;
                x = y;
                y = temp % x;
            }

            gcd = x;
        }

        return gcd;
    }
}
