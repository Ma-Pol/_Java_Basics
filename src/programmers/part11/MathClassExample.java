package programmers.part11;

public class MathClassExample {
    public static void main(String[] args) {
        int value1 = Math.max(5, 30);
        System.out.println("value1: " + value1);

        int value2 = Math.min(5, 30);
        System.out.println("value2: " + value2);

        int value3 = Math.abs(-10);
        System.out.println("value3: " + value3);

        double value4 = Math.random();
        System.out.println("value4: " + value4);
        int random = (int) Math.floor(value4 * 10000);
        System.out.println("random: " + random);

        double value5 = Math.sqrt(25);
        System.out.println("value5: " + value5);
    }
}
