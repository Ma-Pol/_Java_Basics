package kyh_1_introductory.cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 2;
        String evenOdd = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + evenOdd);
    }
}