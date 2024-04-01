package doitAlgorithm.practice.chap02;

import java.util.Random;

public class Q01 {
    public static void main(String[] args) {
        Random rd = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        int num;

        do {
            num = rd.nextInt(11);
        } while (num == 0);

        System.out.printf("사람 수: %d\n", num);

        int[] height = new int[num];

        System.out.println("킷값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rd.nextInt(90);
            System.out.printf("height[%d]: %d\n", i, height[i]);
        }

        System.out.printf("최댓값은 %d입니다.", maxOf(height));
    }

    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];

        return max;
    }
}
