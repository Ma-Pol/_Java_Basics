package programmers.part06.constructor_declaration;

public class Car {
	String name;
	int number;

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	public Car(int number) {
		this.number = number;
	}

	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
