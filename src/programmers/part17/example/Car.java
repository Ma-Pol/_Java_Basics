package programmers.part17.example;

public class Car {
    public String name;
    public int capacity;
    public int price;
    public int age;

    public Car(String name, int capacity, int price, int age) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.age = age;
    }

    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Car car = new Car("new model", 4, 3000, 0);
    }
}
