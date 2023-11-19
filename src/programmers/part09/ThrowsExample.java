package programmers.part09;

public class ThrowsExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            int k = divide(x, y);

            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
        }
    }

    public static int divide(int x, int y) throws ArithmeticException {
        return x / y;
    }
}
