package kyh_4_advanced2.annotation.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 숫자의 범위를 검증하는데 사용. message: 검증 실패 시 출력할 오류 메시지
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {
    int min();

    int max();

    String message() default "범위를 넘었습니다.";
}
