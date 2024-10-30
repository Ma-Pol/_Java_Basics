package kyh_4_advanced2.reflection;

import java.lang.reflect.Field;

public class FieldUtil {
    public static void nullFieldToDefault(Object target) throws IllegalAccessException {
        Class<?> targetClass = target.getClass();
        Field[] declaredFields = targetClass.getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);

            // 필드의 값이 null이 아니면 continue
            if (field.get(target) != null) {
                continue;
            }

            // 필드의 타입을 확인 후, 기본 값으로 설정
            if (field.getType() == String.class) {
                field.set(target, "");
            } else if (field.getType() == Integer.class) {
                field.set(target, 0);
            }
        }
    }
}
