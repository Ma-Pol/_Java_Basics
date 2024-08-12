package kyh_1_introductory.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int total = 0;
        double average;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        arr = new int[scanner.nextInt()];
        scanner.nextLine();

        System.out.println(arr.length + "개의 정수를 입력하세요:");

        for (int i = 0; i < arr.length; i++) {
            total += arr[i] = scanner.nextInt();
        }

        average = (double) total / arr.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
