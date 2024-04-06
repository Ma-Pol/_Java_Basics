package doitAlgorithm.practice.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수: ");
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] idx = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d]: ", i);
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("검색할 값: ");
        int key = Integer.parseInt(br.readLine());

        int count = searchIdx(a, n, key, idx);

        if (count != 0) {
            System.out.printf("%d는 배열 내에 %d개 존재합니다.\n", key, count);
            System.out.printf("배열 내 %d의 위치: { ", key);
            for (int i = 0; i < count - 1; i++)
                System.out.printf("%d, ", idx[i]);
            System.out.printf("%d }\n", idx[count - 1]);
        } else {
            System.out.printf("%d는 배열 내에 존재하지 않습니다.\n", key);
        }

        br.close();
    }

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;

        for (int i = 0; i < n; i++)
            if (a[i] == key)
                idx[count++] = i;

        return count;
    }
}
