package kyh_4_advanced3.lambda.lambda1;

import kyh_4_advanced3.lambda.MyFunction;

public class MyFunctionMain2 {
    public static void main(String[] args) {
        MyFunction myFunction = (int a, int b) -> {
            return a + b;
        };

        int result = myFunction.apply(1, 2);
        System.out.println("result = " + result);
    }
}
