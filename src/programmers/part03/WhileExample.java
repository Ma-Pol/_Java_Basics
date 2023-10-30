package programmers.part03;

public class WhileExample {
	public static void main(String[] args) {
		int i = 0;

		while (i < 10)
			System.out.println("i = " + i++);


		int total = 0;
		int j = 0;

		while (j < 100)
			total += ++j;

		System.out.println("total = " + total);


		int k = 0;

		while (true) {
			System.out.println("Hello!!");

			if (k++ == 10)
				break;
		}
	}
}
