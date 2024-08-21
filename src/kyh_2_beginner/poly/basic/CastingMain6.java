package kyh_2_beginner.poly.basic;

// Java16 부터는 instanceof를 사용하면서 동시에 변수를 선언할 수 있다.
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        System.out.println();

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // parent가 Child 인스턴스인 경우, childMethod() 실행
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스입니다.");
            child.childMethod(); // 다운캐스팅 선언 코드를 생략 가능
        }
    }
}
