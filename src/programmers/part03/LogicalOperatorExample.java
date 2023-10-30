package programmers.part03;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		System.out.println("\na && b = " + (a && b));
		System.out.println("a && c = " + (a && c));

		System.out.println("\na || b = " + (a || b));
		System.out.println("a || c = " + (a || c));

		System.out.println("\n!a = " + !a);
		System.out.println("!b = " + !b);

		System.out.println("\na && b || c && d = " + (a && b || c && d));
		System.out.println("a && (b || c) && d = " + (a && (b || c) && d));
		System.out.println("(a && b) || (c && d) = " + ((a && b) || (c && d)));

		System.out.println("\na && b && c && d = " + (a && b && c && d));
		System.out.println("a || b || c || d = " + (a || b || c || d));

		System.out.println("\na ^ b = " + (a ^ b));
		System.out.println("a ^ c = " + (a ^ c));

		System.out.println("\n!a = " + !a);
		System.out.println("!b = " + !b);

		int score = 88;
		System.out.println("\nscore = " + score);

		if (score <= 100 && score >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
