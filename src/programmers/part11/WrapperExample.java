package programmers.part11;

public class WrapperExample {
    public static void main(String[] args) {
        int i = 5;
        Integer i2 = new Integer(5);

        Integer i3 = 5; // auto boxing

        int i4 = i3.intValue(); // auto unboxing
        int i5 = i3; // auto unboxing
    }
}
