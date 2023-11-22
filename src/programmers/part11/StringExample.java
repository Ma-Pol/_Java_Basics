package programmers.part11;

public class StringExample {
    public static void main(String[] args) {
        // 스트링 클래스의 문제점
        String str1 = "hello world!";
        String str2 = str1.substring(5);

        System.out.println(str1);
        System.out.println(str2); // str1의 문자열은 변화하지 않았음

        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = new StringBuffer().append(str1).append(str2).toString(); // str3 선언 시 내부적으로 일어나는 일
        System.out.println(str4);

        String str5 = "";
        for (int i = 0; i < 100; i++) {
            str5 += "*"; // 매 반복마다 StringBuffer 객체가 새로 생성됨
        }
        System.out.println(str5);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("*"); // StringBuffer 객체가 새로 생성되지 않음
        }
        System.out.println(sb.toString());
    }
}
