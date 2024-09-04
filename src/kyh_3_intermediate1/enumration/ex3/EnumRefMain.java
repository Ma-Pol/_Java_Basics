package kyh_3_intermediate1.enumration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("\nref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    // 열거형은 toString()을 재정의하기 때문에 참조값을 직접 확인할 수 없다.
    // 따라서 아래 메서드와 같이 확인해야 한다.
    // System.identityHashCode(grade): 객체 참조값을 숫자로 반환한다.
    // Integer.toHexString(): 숫자를 16진수로 변환해 반환한다.
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
