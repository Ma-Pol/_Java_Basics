package part02;

public class ConstantExample {
	public static void main(String[] args) {
		int i;
		i = 10;
		i = 5;

		final int J; // 상수 선언 시 대문자 명사 사용이 일반적
		J = 10;
//		J = 5;

		double circleArea;

		final double PI = 3.141592;

		circleArea = 3 * 3 * PI;

		final int OIL_PRICE = 1390;

		int totalPrice = 50 * OIL_PRICE;
	}
}
