package kyh_4_advanced3.lambda.start;

import kyh_4_advanced3.lambda.Procedure;

import java.util.Random;

// 익명 클래스 사용 - 변수 제거, 익명 클래스의 참조값을 매개변수에 직접 전달
public class Ex1RefMainV3 {
    public static void main(String[] args) {
        hello(new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        hello(new Procedure() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        // 코드 조각 시작
        procedure.run();
        // 코드 조각 종료

        long endNs = System.nanoTime();

        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }
}
