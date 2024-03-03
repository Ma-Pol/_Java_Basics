package doitAlgorithm.chap01;

import java.io.IOException;

public class Max3Method {
    public static void main(String[] args) throws IOException {
        System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
        System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
        System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
        System.out.println("max3(3, 2, 3) = " + max3(3, 2, 3));
        System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
        System.out.println("max3(3, 3, 2) = " + max3(3, 3, 2));
        System.out.println("max3(3, 3, 3) = " + max3(3, 3, 3));
        System.out.println("max3(2, 2, 3) = " + max3(2, 2, 3));
        System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
        System.out.println("max3(2, 3, 2) = " + max3(2, 3, 2));
        System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2));
        System.out.println("max3(2, 3, 3) = " + max3(2, 3, 3));
        System.out.println("max3(1, 2, 3) = " + max3(1, 2, 3));
    }

    static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
