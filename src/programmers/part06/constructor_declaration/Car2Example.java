package programmers.part06.constructor_declaration;

public class Car2Example {
	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("car1.name: " + car1.name);
		System.out.println("car1.number: " + car1.number);
		System.out.println();

		Car2 car2 = new Car2("그랜저");
		System.out.println("car2.name: " + car2.name);
		System.out.println("car2.number: " + car2.number);
		System.out.println();

		Car2 car3 = new Car2(5031);
		System.out.println("car3.name: " + car3.name);
		System.out.println("car3.number: " + car3.number);
		System.out.println();

		Car2 car4 = new Car2("스포티지", 1402);
		System.out.println("car4.name: " + car4.name);
		System.out.println("car4.number: " + car4.number);
	}
}
