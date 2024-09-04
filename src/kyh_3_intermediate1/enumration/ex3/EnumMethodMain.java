package kyh_3_intermediate1.enumration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능
/*
        ENUM 주요 메서드
        - values(): 모든 ENUM 상수를 포함하는 배열을 반환한다.
        - valueOf(String name): 주어진 이름과 일치하는 ENUM 상수를 반환한다.
        - name(): ENUM 상수의 이름을 문자열로 반환한다.
        - ordinal(): ENUM 상수의 선언 순서(0부터 시작)를 반환한다.
        - toString(): ENUM 상수의 이름을 문자열로 반환한다.
                      name()과 유사하지만 toString()은 직접 오버라이딩할 수 있다.
*/
    }
}
