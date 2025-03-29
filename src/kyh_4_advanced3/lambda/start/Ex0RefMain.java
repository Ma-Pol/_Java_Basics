package kyh_4_advanced3.lambda.start;

public class Ex0RefMain {
    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }

    public static void hello(String message) {
        System.out.println("프로그램 시작");
        System.out.println(message);
        System.out.println("프로그램 종료");
    }
}
