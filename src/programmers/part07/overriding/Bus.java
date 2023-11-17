package programmers.part07.overriding;

public class Bus extends Car {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
        super.run(); // 부모 클래스의 메서드를 호출
    }
}
