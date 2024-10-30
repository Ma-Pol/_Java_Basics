package kyh_4_advanced2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ConstructV2 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("kyh_4_advanced2.reflection.data.BasicData");

        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true); // private 생성자 접근 허용
        Object instance = constructor.newInstance("hello"); // 객체 생성
        System.out.println("instance = " + instance);

        Method method1 = aClass.getDeclaredMethod("call");
        method1.invoke(instance);
    }
}
