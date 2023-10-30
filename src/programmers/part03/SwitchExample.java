package programmers.part03;

public class SwitchExample {
	public static void main(String[] args) {
		// switch, case, default, break

		int value = 1;

		switch (value) {
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			default:
				System.out.println("1, 2, 3이 아닙니다.");
				break;
		}

		System.out.println();

		String str = "A";

		switch (str) {
			case "A":
				System.out.println("A입니다.");
				break;
			case "B":
				System.out.println("B입니다.");
				break;
			case "C":
				System.out.println("C입니다.");
				break;
			default:
				System.out.println("A, B, C가 아닙니다.");
				break;
		}
	}
}
