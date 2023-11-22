package programmers.part11;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("Hello").append(" ");
        sb.append("World!");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("Hello");

        if (sb2 == sb3) {
            System.out.println("sb2와 sb3는 같은 객체입니다.\n");
        }

        // 메서드 체이닝(Method Chaining)
        // 자기 자신을 리턴하여 계속해서 자신의 메서드를 호출하는 방식
        String str2 = new StringBuffer().append("Hello").append(" ").append("World!").toString();
        System.out.println(str2);
    }
}
