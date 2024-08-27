package kyh_3_intermediate1.lang.wrapper.ex;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer 은 오토 박싱, 오토 언박싱 대상 외
        Integer integer1 = Integer.valueOf(str);
        int intValue = integer1;
        Integer integer2 = intValue;

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
