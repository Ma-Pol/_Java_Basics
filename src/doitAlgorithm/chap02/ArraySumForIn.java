package doitAlgorithm.chap02;

public class ArraySumForIn {
    public static void main(String[] args) {
        double[] a = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %.1f\n", i, a[i]);
        }

        double sum = 0;

        for (double i : a)
            sum += i;

        System.out.printf("모든 요소의 합은 %.1f입니다.\n", sum);
    }
}
