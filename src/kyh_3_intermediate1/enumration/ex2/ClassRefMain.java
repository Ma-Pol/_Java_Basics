package kyh_3_intermediate1.enumration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("\nref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);

        // 모든 각각의 상수는 ClassGrade 인스턴스를 참조한다.
        // 각 상수는 모두 서로 각각 다른 ClassGrade 인스턴스를 참조한다.
    }
}
