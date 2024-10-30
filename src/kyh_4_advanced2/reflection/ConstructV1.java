package kyh_4_advanced2.reflection;

import java.lang.reflect.Constructor;

public class ConstructV1 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("kyh_4_advanced2.reflection.data.BasicData");

        System.out.println("===== constructors() =====");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\n===== declaredConstructors() =====");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }
    }
}
