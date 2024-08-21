package kyh_2_beginner.poly.basic;

// 다운캐스팅을 명시적으로만 가능하게 하는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent(); // 참조 내부에 Child 인스턴스 존재 X
        Child child2 = (Child) parent2; // [런타임] 오류 - ClassCastException
        child2.childMethod(); // 실행 불가
    }
}
