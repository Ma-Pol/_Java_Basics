package doitAlgorithm.practice.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수: ");
        int num = Integer.parseInt(br.readLine());
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            x[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("검색할 값: ");
        int ky = Integer.parseInt(br.readLine());

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.printf("그 값은 x[%d]에 있습니다.\n", idx);

        br.close();
    }

    static int seqSearchSen(int[] a, int n, int key) {
        int i;

        a[n] = key;

        for (i = 0; i < n; i++)
            if (a[i] == key) break;

        return i == n ? -1 : i;
    }
}
