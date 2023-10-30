package programmers.part02;

public class OperatorExample {
	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;

		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2); // i2 = -5 (+부호는 현재 부호를 그대로 유지함)
		System.out.println("i3 = " + i3); // i3 = 5 (-부호는 현재 부호를 반대로 바꿈)

		int i4 = ++i3; // i3 = i3 + 1; i4 = i3;
		System.out.println("\ni3 = " + i3); // i3 = 6
		System.out.println("i4 = " + i4); // i4 = 6

		int i5 = i3++; // i5 = i3; i3 = i3 + 1;
		System.out.println("\ni3 = " + i3); // i3 = 7
		System.out.println("i5 = " + i5); // i5 = 6


		int i = 5;
		int j = 2;

		System.out.println("\ni = " + i);
		System.out.println("j = " + j);
		System.out.println("\ni + j = " + (i + j));
		System.out.println("i - j = " + (i - j));
		System.out.println("i * j = " + (i * j));
		System.out.println("i / j = " + (i / j)); // 2, 정수형 나눗셈
		System.out.println("(double) i / j = " + ((double) i / j)); // 2.5, 실수형 나눗셈
		System.out.println("i % j = " + (i % j)); // 1, 정수형 나머지 연산
	}
}
