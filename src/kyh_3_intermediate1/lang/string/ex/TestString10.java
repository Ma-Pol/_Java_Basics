package kyh_3_intermediate1.lang.string.ex;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] split = fruits.split(",");
        for (String fruit : split) {
            System.out.println(fruit);
        }

        String joinedString = String.join("->", split);
        System.out.println("joinedString = " + joinedString);
    }
}
