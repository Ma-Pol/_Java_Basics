package programmers.part07.inheritance;

public class BusExample {
    public static void main(String[] args) {
        Bus bus = new Bus();

        bus.run();
        bus.horn();

        Car car = new Car();

        car.run();
//        car.horn();
    }
}
