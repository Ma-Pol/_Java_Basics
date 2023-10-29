package part02;

public class OperatorPriorityExample {
	public static void main(String[] args) {
		// 연산자 우선 순위
		// 1. 최우선 연산자 ( ., [], (), (type), new )
		// 2. 단항 연산자 (+, -, ++, --, ~, !)
		// 3. 산술 연산자 (*, /, %, +, -)
		// 4. 시프트 연산자 (<<, >>, >>>)
		// 5. 비교 연산자 (<, >, <=, >=, ==, !=)
		// 6. 비트 연산자 (&, ^, |)
		// 7. 논리 연산자 (&&, ||, !)
		// 8. 삼항 연산자 (조건식 ? 참 : 거짓)
		// 9. 대입 연산자 (=, +=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, ^=, |=)

		int a = 5;
		int b = 10;
		int c = 15;

		System.out.println("a - b * c = " + (a - b * c));
		System.out.println("(a - b) * c = " + ((a - b) * c));

		System.out.println("a > 5 && b > 5 = " + (a-- > 5 && b-- > 5));

		System.out.println("a = " + a); // 4
		System.out.println("b = " + b); // 10 : a > 5 && b > 5에서 a > 5가 false이므로 b-- > 5는 실행되지 않음

		System.out.println("++a - 5 = " + (++a - 5)); // 0 : a = 4에서 ++a가 실행되어 a = 5가 됨
	}
}
