package programmers.part07.super_keyword;

public class Truck extends Car {

    public Truck() {
//        super(); // 부모 클래스의 기본 생성자를 호출(명시하지 않아도 자동으로 실행)
        super("소방차"); // 부모 클래스의 생성자 중 매개변수가 있는 생성자를 호출(반드시 명시해야만 함)
        System.out.println("Truck의 기본 생성자입니다.");
    }
}
