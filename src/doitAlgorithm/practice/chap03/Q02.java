package doitAlgorithm.practice.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d]: ", i);
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("검색할 값: ");
        int target = Integer.parseInt(br.readLine());

        int idx = seqSearch(arr, n, target);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.printf("그 값은 x[%d]에 있습니다.\n", idx);

        br.close();
    }

    static int seqSearch(int[] arr, int n, int target) {
        int idx = 0;

        System.out.printf("%3s|", " ");

        for (int i = 0; i < n; i++)
            System.out.printf("%3d", i);

        System.out.printf("\n%3s+", "---");

        for (int i = 0; i < n; i++)
            System.out.printf("%3s", "---");

        System.out.println();

        while (idx != n) {
            System.out.printf("%3s|", " ");

            for (int i = 0; i <= idx; i++) {
                if (i == idx)
                    System.out.printf("%3s", "*");
                else
                    System.out.printf("%3s", " ");
            }

            System.out.printf("\n%3d|", idx);

            for (int i = 0; i < n; i++)
                System.out.printf("%3d", arr[i]);

            System.out.println();

            if (arr[idx] == target)
                return idx;
            else
                idx++;
        }

        return -1;
    }
}
