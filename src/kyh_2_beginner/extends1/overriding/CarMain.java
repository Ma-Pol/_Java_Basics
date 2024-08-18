package kyh_2_beginner.extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        System.out.println();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
