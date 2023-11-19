package programmers.part09;

public class ThrowExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            int k = divide(x, y);

            System.out.println(k);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    public static int divide(int x, int y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("2번째 매개변수는 0이 될 수 없습니다.");
        }

        return x / y;
    }
}
