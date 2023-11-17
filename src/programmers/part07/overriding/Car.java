package programmers.part07.overriding;

public class Car {
    public Car() {
        System.out.println("Car의 기본 생성자");
        this.run(); // 자식 클래스가 인스턴스화 될 때, 자식 클래스에서 오버라이딩한 경우 자식 클래스의 메서드가 호출됨
    }

    public void run() {
        System.out.println("Car의 run 메서드");
    }
}
