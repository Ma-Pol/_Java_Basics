package doitAlgorithm.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수:");
        int num = Integer.parseInt(br.readLine());

        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("height[%d]: ", i);
            height[i] = Integer.parseInt(br.readLine());
        }

        System.out.printf("최댓값은 %d입니다.", maxOf(height));

        br.close();
    }

    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];

        return max;
    }
}
