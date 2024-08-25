package kyh_3_intermediate1.lang.string.ex;

public class TestString7 {
    public static void main(String[] args) {
        String original = "    Hello java    ";

        String result = original.strip();
        System.out.println("result = " + result);
    }
}
