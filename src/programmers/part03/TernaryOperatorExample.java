package programmers.part03;

public class TernaryOperatorExample {
	public static void main(String[] args) {
		int a = 5 > 4 ? 50 : 40;

		System.out.println("a = " + a);

		int b = 0;

		if (5 > 4) {
			b = 50;
		} else {
			b = 40;
		}

		System.out.println("b = " + b);
	}
}
