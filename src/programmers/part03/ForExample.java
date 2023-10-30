package programmers.part03;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("sum = " + sum);


		int sum2 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
		}

		System.out.println("sum2 = " + sum2);


		int sum3 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum3 += i;
			}
		}

		System.out.println("sum3 = " + sum3);
	}
}
