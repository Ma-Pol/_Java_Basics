package programmers.part04;

// 1차원 배열
public class ODArrayExample {
	public static void main(String[] args) {
		int[] array1 = new int[100];

		array1[0] = 50;
		array1[10] = 100;

		int[] array2 = new int[]{1, 2, 3, 4, 5};

		int[] array3 = {1, 2, 3, 4, 5};

		System.out.println(array3[3]);

		int value = array3[0];

		System.out.println(value);
	}
}
