package kyh_4_advanced3.lambda.lambda1;

import kyh_4_advanced3.lambda.Procedure;

public class ProcedureMain2 {
    public static void main(String[] args) {
        Procedure procedure = () -> {
            System.out.println("hello! lambda");
        };

        procedure.run();
    }
}
