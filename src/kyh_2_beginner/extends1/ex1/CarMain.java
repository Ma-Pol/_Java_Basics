package kyh_2_beginner.extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        System.out.println();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}