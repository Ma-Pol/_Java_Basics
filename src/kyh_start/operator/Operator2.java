package kyh_start.operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기
        String result1 = "Hello " + "World";
        System.out.println(result1);    // Hello World

        // 문자열과 문자열 더하기 2
        String str1 = "string1";
        String str2 = "string2";
        String result2 = str1 + str2;
        System.out.println(result2);    // string1string2

        // 문자열과 숫자 더하기 1
        String result3 = "a + b = " + 10;
        System.out.println(result3);    // a + b = 10

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);    // a + b = 20
    }
}
