package kyh_3_intermediate1.lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Object dog = new Dog(); // Dog -> Object
        Object car = new Car(); // Car -> Object

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        obj.sound(); // 컴파일 오류 발생, Object 클래스에는 sound()가 없다.
//        obj.move(); // 컴파일 오류 발생, Object 클래스에는 move()가 없다.

        // 객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
