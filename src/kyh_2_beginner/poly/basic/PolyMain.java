package kyh_2_beginner.poly.basic;

/**
 * 다형적 참조: 부모는 자식을 품을 수 있다.
 */
public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스를 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println();

        // 자식 변수가 자식 인스턴스를 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println();

        // 부모 변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // 자식의 기능은 호출할 수 없다.
//        poly.childMethod(); // 컴파일 오류 발생

        // 자식 변수는 부모 인스턴스를 참조할 수 없다.
//        Child child1 = new Parent(); // 컴파일 오류 발생
    }
}
