package programmers.part09;

public class TryCatchExample {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            int k = i / j;

            System.out.println(k);
        } catch (ArithmeticException ae) {
            System.out.println("0으로 나눌 수 없습니다. : " + ae.toString());
        } finally {
            System.out.println("예외가 발생하든 안하든 무조건 실행");
        }

        System.out.println("main end");
    }
}
