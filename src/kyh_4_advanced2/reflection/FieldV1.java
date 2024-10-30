package kyh_4_advanced2.reflection;

import kyh_4_advanced2.reflection.data.BasicData;

import java.lang.reflect.Field;

// 클래스의 필드 메타데이터 조회 방법
public class FieldV1 {
    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        // 해당 클래스와 상위 클래스에서 상속, 선언된 "모든 public" 필드를 반환
        System.out.println("===== fields() =====");
        Field[] fields = helloClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        for (Field field : fields) {
            System.out.println("field.getName() = " + field.getName());
        }

        // 해당 클래스에서 선언된 "모든" 필드를 반환
        System.out.println("\n===== declaredFields() =====");
        Field[] declaredFields = helloClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("declaredField = " + field);
        }
        for (Field field : declaredFields) {
            System.out.println("declaredField.getName() = " + field.getName());
        }
    }
}
