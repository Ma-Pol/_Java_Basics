package kyh_3_intermediate1.examples.lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
