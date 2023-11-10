package programmers.part06.method_overloading;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		MethodOverloadingExample m = new MethodOverloadingExample();
		m.print(1);
		m.print("Hello");
		m.print(1, 2);
		m.print("Hello", "World");
	}

	private void print(int i) {
		System.out.println(i);
	}

	private void print(String s) {
		System.out.println(s);
	}

	private void print(int i, int j) {
		System.out.println(i + ", " + j);
	}

	private void print(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}
}
