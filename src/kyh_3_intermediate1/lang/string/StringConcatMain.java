package kyh_3_intermediate1.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        // 본래 String 클래스는 + 연산이 불가능하다.
        // 하지만 문자열은 자주 다루어지기 때문에 자바 언어에서는 편의상 + 연산을 제공한다.
        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
