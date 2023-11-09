package programmers.part05.method_declaration;

public class MyClass {
	public void method1() {
		System.out.println("method1이 실행됨..");
	}

	public void method2(int x) {
		System.out.println(x + "를 이용한 method2 실행");
	}

	public int method3() {
		System.out.println("정수 10을 리턴하는 method3 실행");
		return 10;
	}

	public void method4(int x, int y) {
		System.out.println(x + "와 " + y + "를 이용한 method4 실행");
	}

	public int method5(int y) {
		System.out.println(y + "를 이용한 method5 실행");
		return y * 2;
	}
}
