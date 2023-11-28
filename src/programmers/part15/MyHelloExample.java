package programmers.part15;

import java.lang.reflect.Method;

public class MyHelloExample {
    public static void main(String[] args) {
        MyHello hello = new MyHello();

        try {
            Method method = hello.getClass().getDeclaredMethod("hello"); // 메서드 정보 얻기

            if (method.isAnnotationPresent(Count100.class)) // 어노테이션 존재 여부 확인
                for (int i = 0; i < 100; i++)
                    hello.hello();
            else
                hello.hello();
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }

    }
}
