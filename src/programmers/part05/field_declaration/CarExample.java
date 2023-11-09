package programmers.part05.field_declaration;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();

		car1.name = "소방차";
		car1.number = 1234;

		car2.name = "구급차";
		car2.number = 1111;

		System.out.println("car1의 이름은 " + car1.name + "이고, 번호는 " + car1.number + "입니다.");
		System.out.println("car2의 이름은 " + car2.name + "이고, 번호는 " + car2.number + "입니다.");
	}
}
