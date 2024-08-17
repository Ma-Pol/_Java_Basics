package kyh_2_beginner.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; // 인스턴스 변수 접근, 컴파일 에러 발생
//        instanceMethod(); // 인스턴스 메서드 접근, 컴파일 에러 발생

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

    /*
    - 정적 메서드가 인스턴스의 기능을 사용할 수 없는 이유

    1. 정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다.
        => 인스턴스와 같은 참조값의 개념이 없다.

    2. 특정 인스턴스의 기능을 사용하기 위해서는 참조값을 알아야 한다.
        => 정적 메서드는 참조값 없이 호출한다.
        => 따라서 정적 메서드 내부에서는 인스턴스 변수/메서드를 사용할 수 없다.
     */

    // 정적 메서드에서 인스턴스 변수/메서드를 사용하기 위한 방법
    public static void staticCallWhatCanUsingInstance(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }
}
