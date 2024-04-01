package doitAlgorithm.practice.chap02;

import java.util.Arrays;

public class Q02n03n04n05 {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 9, 6, 7};

        reverse(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.print("역순 정렬을 마쳤습니다.");
    }

    // Q05
    static void rcopy(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr1[i] = arr2[arr2.length - 1 - i];
        }
    }

    // Q04
    static void copy(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr1[i] = arr2[i];
        }
    }

    // Q03
    static int sumOf(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // Q02
    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(Arrays.toString(arr));
            System.out.printf("arr[%d]와(과) arr[%d]을(를) 교환합니다.\n", i, arr.length - 1 - i);
            swap(arr, i, arr.length - 1 - i);
        }
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
