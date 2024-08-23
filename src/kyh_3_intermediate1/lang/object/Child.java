package kyh_3_intermediate1.lang.object;

// 상속받을 부모 클래스를 명시하면 Object를 상속받지 않는다.
// 참고: 부모 클래스가 묵시적으로 Object를 상속받았기에 기능 사용은 가능하다.
public class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
