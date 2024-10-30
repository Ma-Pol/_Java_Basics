package kyh_4_advanced2.reflection;

import kyh_4_advanced2.reflection.data.BasicData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 정적 메서드 호출과 동적 메서드 호출
public class MethodV2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 정적 메서드 호출 - 일반적인 메서드 호출
        BasicData helloInstance = new BasicData();
        helloInstance.call(); // 이 부분은 코드를 변경하지 않는 이상 정적이다.

        // 동적 메서드 호출 - 리플렉션 사용
        Class<? extends BasicData> helloClass = helloInstance.getClass();
        String methodName = "hello"; // 메서드 이름을 변수로 사용할 수 있다.

        // 메서드 명: hello, 매개변수 타입: String.class 인 메서드를 찾는다.
        Method method1 = helloClass.getDeclaredMethod(methodName, String.class);
        // helloInstance 내에서 위 메서드를 찾아 매개변수로 "hi"를 전달해 실행하고 결과를 리턴
        Object returnValue = method1.invoke(helloInstance, "hi");
        System.out.println("returnValue = " + returnValue);
    }
}
