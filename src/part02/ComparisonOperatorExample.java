package part02;

public class ComparisonOperatorExample {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;

		System.out.println("i == j : " + (i == j)); // true
		System.out.println("i != j : " + (i != j)); // false
		System.out.println("i < j : " + (i < j)); // false
		System.out.println("i <= j : " + (i <= j)); // true
		System.out.println("i > j : " + (i > j)); // false
		System.out.println("i >= j : " + (i >= j)); // true

		i += 10; // i = i + 10;

		System.out.println(i);

		System.out.println(i -= 5);
		System.out.println(i);
	}
}
