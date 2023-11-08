package programmers.part05.class_declaration;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCompany("현대");
		car1.setModel("그랜저");
		car1.setColor("하양");
		car1.setMaxSpeed(350);

		Car car2 = new Car("현대", "제네시스", "검정", 225);

		System.out.println("car1.company: " + car1.getCompany());
		System.out.println("car1.model: " + car1.getModel());
		System.out.println("car1.color: " + car1.getColor());
		System.out.println("car1.maxSpeed: " + car1.getMaxSpeed());

		System.out.println("\ncar2.company: " + car2.getCompany());
		System.out.println("car2.model: " + car2.getModel());
		System.out.println("car2.color: " + car2.getColor());
		System.out.println("car2.maxSpeed: " + car2.getMaxSpeed());

		System.out.println("\n" + car1.toString());
		System.out.println(car2.toString());
	}
}
