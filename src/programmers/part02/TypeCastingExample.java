package programmers.part02;

public class TypeCastingExample {
	public static void main(String[] args) {
		int x = 50000;
		long y = x; // 묵시적 형변환

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		long x2 = 5l;
//		int y2 = x2; // 컴파일 에러
		int y2 = (int) x2; // 명시적 형변환(강제 형변환)

		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);
	}
}
