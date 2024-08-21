package kyh_2_beginner.poly.overriding;

// 오버라이딩 된 메서드가 항상 우선권을 가진다.
public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스를 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println();

        // 부모 변수가 부모 인스턴스를 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("parent = " + parent.value);
        parent.method();

        System.out.println();

        // 부모 변수가 자식 인스턴스를 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("poly = " + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드 오버라이딩!
        // 변수 타입은 부모이기 때문에 인스턴스 내 부모 클래스를 먼저 참조
        // => 자식 클래스에서 부모 클래스의 해당 메서드를 오버라이딩 했음을 확인
        // => 오버라이딩 된 자식 클래스의 메서드를 찾아가 호출
    }
}
