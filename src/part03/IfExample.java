package part03;

public class IfExample {
	public static void main(String[] args) {
		int x = 50;
		int y = 50;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println();

//		if (x > y) {
//			System.out.println("x는 y보다 큽니다.");
//		}
//
//		if (x < y) {
//			System.out.println("x는 y보다 작습니다.");
//		}
//
//		if (x == y)
//			System.out.println("x는 y와 같습니다.");

//		if (x == y) {
//			System.out.println("x는 y와 같습니다.");
//		} else {
//			System.out.println("x는 y와 같지 않습니다.");
//		}

		if (x > y) {
			System.out.println("x는 y보다 큽니다.");
		} else if (x < y) {
			System.out.println("x는 y보다 작습니다.");
		} else {
			System.out.println("x는 y와 같습니다.");
		}
	}
}
