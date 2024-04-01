package doitAlgorithm.chap02;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5,};
        int[] b = a.clone();

        b[3] = 0;

        System.out.printf("a = %s\n", Arrays.toString(a));
        System.out.printf("b = %s\n", Arrays.toString(b));
    }
}
