package programmers.part05;

public class VariableScopeExample {
	int globalScope = 10;

	static int staticValue = 20;

	public void scopeTest(int value) {
		int localScope = 20;

		System.out.println(this.globalScope);
		System.out.println(localScope);
		System.out.println(value);
		System.out.println(staticValue);
	}

	public void scopeTest2(int value2) {
		System.out.println(this.globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
		System.out.println(staticValue);
	}

	// static 메서드는 객체 생성 없이 호출 가능하므로 static 하지 않은 필드나 메서드는 사용할 수 없다.
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
//		System.out.println(value2);
		System.out.println(staticValue);

		VariableScopeExample v1 = new VariableScopeExample();
		System.out.println(v1.globalScope);

		VariableScopeExample v2 = new VariableScopeExample();

		// 일반 변수는 인스턴스마다 독립적인 값을 유지한다. (인스턴스 변수)
		v1.globalScope = 30;
		v2.globalScope = 40;
		System.out.println("v1.globalScope : " + v1.globalScope);
		System.out.println("v2.globalScope : " + v2.globalScope);

		// static 변수는 모든 인스턴스가 공유하는 필드이므로,
		// v1.staticValue = 50; 이후에 v2.staticValue = 60;을 수행하면 v1.staticValue 값도 60으로 변경된다. (클래스 변수)
		v1.staticValue = 50;
		v2.staticValue = 60;
		System.out.println("v1.staticValue : " + v1.staticValue);
		System.out.println("v2.staticValue : " + v2.staticValue);
		System.out.println("VariableScopeExample.staticValue : " + VariableScopeExample.staticValue); // 권장
	}
}
