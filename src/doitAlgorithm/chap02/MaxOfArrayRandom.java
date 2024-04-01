package doitAlgorithm.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MaxOfArrayRandom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rd = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = Integer.parseInt(br.readLine());

        int[] height = new int[num];

        System.out.println("킷값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rd.nextInt(90);
            System.out.printf("height[%d]: %d\n", i, height[i]);
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
