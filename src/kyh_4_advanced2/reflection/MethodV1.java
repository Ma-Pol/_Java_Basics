package kyh_4_advanced2.reflection;

import kyh_4_advanced2.reflection.data.BasicData;

import java.lang.reflect.Method;

// 클래스의 메서드 메타데이터 조회 방법
public class MethodV1 {
    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        // 해당 클래스와 상위 클래스에서 상속, 선언된 "모든 public" 메서드를 반환
        System.out.println("===== methods() =====");
        Method[] methods = helloClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        for (Method method : methods) {
            System.out.println("method.getName() = " + method.getName());
        }

        // 해당 클래스에서 선언된 "모든" 메서드를 반환
        System.out.println("\n===== declaredMethods() =====");
        Method[] declaredMethods = helloClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("declaredMethod = " + method);
        }
        for (Method method : declaredMethods) {
            System.out.println("declaredMethod.getName() = " + method.getName());
        }
    }
}
