package kyh_3_intermediate1.lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java"); // String은 불변 객체이므로 기존 값을 변경하지 않고 새로운 결과를 만들어 반환한다.
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
