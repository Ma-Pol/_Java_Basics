package kyh_3_intermediate2.generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("object print: " + obj);
        return obj;
    }

    // <T>: 제네릭 심볼 정의
    // T: 반환 타입
    // (T t) 매개변수 타입
    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
