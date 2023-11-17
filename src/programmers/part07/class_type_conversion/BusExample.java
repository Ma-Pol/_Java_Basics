package programmers.part07.class_type_conversion;

public class BusExample {
    public static void main(String[] args) {
        Car car = new Bus();

        car.run();
//        car.horn(); // Car 타입의 변수로는 horn() 메소드에 접근할 수 없다.

        System.out.println("-------------------------------");

        Bus bus = (Bus) car; // 강제 타입 변환
        bus.run();
        bus.horn();
    }
}
