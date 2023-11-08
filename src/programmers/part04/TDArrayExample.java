package programmers.part04;

public class TDArrayExample {
	public static void main(String[] args) {
		int[][] array4 = new int[3][4];
		array4[0][1] = 10;

		System.out.println("array4의 모든 요소");
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[i].length; j++) {
				System.out.print(array4[i][j] + " ");
			}
			System.out.println();
		}

		int[][] array5 = new int[3][];
		array5[0] = new int[1];
		array5[1] = new int[2];
		array5[2] = new int[3];

		System.out.println("\narray5의 모든 요소");
		for (int i = 0; i < array5.length; i++) {
			for (int j = 0; j < array5[i].length; j++) {
				System.out.print(array5[i][j] + " ");
			}
			System.out.println();
		}

		int[][] array6 = {{95}, {83, 96}, {78, 83, 87, 88}};

		System.out.println("\narray6의 모든 요소");
		for (int i = 0; i < array6.length; i++) {
			for (int j = 0; j < array6[i].length; j++) {
				System.out.print(array6[i][j] + " ");
			}
			System.out.println();
		}
	}
}
