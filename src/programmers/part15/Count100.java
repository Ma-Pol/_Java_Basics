package programmers.part15;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 JVM이 감지할 수 있도록 함
public @interface Count100 {

}
