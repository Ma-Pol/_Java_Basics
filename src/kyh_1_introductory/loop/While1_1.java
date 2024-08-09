package kyh_1_introductory.loop;

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        count = count + 1;
        System.out.println("현재 숫자는: " + count);
        count = count + 1;
        System.out.println("현재 숫자는: " + count);

        count = 0;

        // 개선
        count++;
        System.out.println("현재 숫자는: " + count);
        count++;
        System.out.println("현재 숫자는: " + count);
        count++;
        System.out.println("현재 숫자는: " + count);
    }
}
