package kyh_4_advanced2.annotation.validator;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws Exception {
        // 전달된 객체에 선언된 모든 필드를 탐색
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true); // private 필드도 탐색

            // @NotEmpty 애노테이션이 있는 경우
            if (field.isAnnotationPresent(NotEmpty.class)) {
                String value = (String) field.get(obj);
                NotEmpty annotation = field.getAnnotation(NotEmpty.class);

                if (value == null || value.isEmpty()) {
                    throw new RuntimeException(annotation.message());
                }
            }

            // @Range 애노테이션이 있는 경우
            if (field.isAnnotationPresent(Range.class)) {
                long value = field.getLong(obj);
                Range annotation = field.getAnnotation(Range.class);

                if (value < annotation.min() || value > annotation.max()) {
                    throw new RuntimeException(annotation.message());
                }
            }
        }
    }
}
