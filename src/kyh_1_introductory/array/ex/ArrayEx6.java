package kyh_1_introductory.array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        numbers = new int[scanner.nextInt()];
        scanner.nextLine();

        System.out.println(numbers.length + "개의 정수를 입력하세요:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
