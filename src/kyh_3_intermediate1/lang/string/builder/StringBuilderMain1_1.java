package kyh_3_intermediate1.lang.string.builder;

// StringBuilder: 가변 String 클래스
public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A"); // 가변 객체이기에 리턴값 없이 기능
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder -> String
        String str = sb.toString();
        System.out.println("str = " + str);
    }
}
