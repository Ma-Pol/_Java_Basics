package programmers.part06.constructor_declaration;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.name: " + car1.name);
		System.out.println("car1.number: " + car1.number);
		System.out.println();

		Car car2 = new Car("그랜저");
		System.out.println("car2.name: " + car2.name);
		System.out.println("car2.number: " + car2.number);
		System.out.println();

		Car car3 = new Car(5031);
		System.out.println("car3.name: " + car3.name);
		System.out.println("car3.number: " + car3.number);
		System.out.println();

		Car car4 = new Car("스포티지", 1402);
		System.out.println("car4.name: " + car4.name);
		System.out.println("car4.number: " + car4.number);
	}
}
