package kyh_1_introductory.method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        getAverage(1, 2, 3);
        getAverage(15, 25, 35);
    }

    public static void getAverage(int a, int b, int c) {
        System.out.println("평균값: " + (a + b + c) / 3.0);
    }
}
