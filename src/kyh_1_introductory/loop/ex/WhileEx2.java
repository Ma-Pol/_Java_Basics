package kyh_1_introductory.loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;

        while (num <= 20) {
            System.out.println(num);
            num += 2;
        }

        /*
        다른 풀이

        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
         */
    }
}
