package kyh_3_intermediate1.lang.wrapper.ex;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0.0;
        for (String str : array) {
            sum += Double.parseDouble(str);
        }
        System.out.println("sum = " + sum);
    }
}
