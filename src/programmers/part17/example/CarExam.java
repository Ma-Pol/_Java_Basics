package programmers.part17.example;

import java.util.ArrayList;
import java.util.List;

public class CarExam {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("작은차", 2, 800, 3));
        cars.add(new Car("봉고차", 12, 1500, 8));
        cars.add(new Car("중간차", 5, 2200, 0));
        cars.add(new Car("비싼차", 5, 3500, 1));

//        printCarCheaperThan(cars, 2000);
//        printCar(cars, new CheckCarForBigAndNotExpensive());

        // 익명 클래스를 이용하는 경우 ===========
//        printCar(cars,
//                new CheckCar() {
//                    public boolean test(Car car) {
//                        return car.capacity >= 4 && car.price < 2500;
//                    }
//                });
        // ======================================


        // 람다 표현식을 이용하는 경우 ===========
        CarExam carExam = new CarExam();
        carExam.printCar(cars, (Car car) -> {
            return car.capacity >= 4 && car.price < 2500;
        });
        // ======================================
    }

    // 메서드를 이용하는 경우 ====================
    public static void printCarCheaperThan(List<Car> cars, int price) {
        for (Car car : cars)
            if (car.price < price)
                System.out.println(car);
    }
    // ==========================================

    // 내부 클래스를 이용하는 경우 ===============
    public static void printCar(List<Car> cars, CheckCar tester) {
        for (Car car : cars)
            if (tester.test(car))
                System.out.println(car);
    }

    interface CheckCar {
        boolean test(Car car);
    }

//    public static class CheckCarForBigAndNotExpensive implements CheckCar {
//        @Override
//        public boolean test(Car car) {
//            return car.capacity >= 4 && car.price < 2500;
//        }
//    }
    // ===========================================
}
