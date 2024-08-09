package kyh_start.loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        for (int num = 2; num <= 20; num = num + 2) {
            System.out.println(num);
        }

        /*
        다른 풀이

        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
         */
    }
}
