package programmers.part05.method_declaration;

public class MyClassExample {
	public static void main(String[] args) {
		MyClass mc = new MyClass();

		mc.method1();
		mc.method2(10);
		System.out.println("mc.method3() 실행 결과 : " + mc.method3());
		mc.method4(10, 20);
		System.out.println("mc.method5() 실행 결과 : " + mc.method5(10));

	}
}
