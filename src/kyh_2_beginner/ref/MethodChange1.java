package kyh_2_beginner.ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        chanegePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void chanegePrimitive(int x) {
        x = 20;
    }
}
