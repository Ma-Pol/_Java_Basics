package doitAlgorithm.practice.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수: ");
        int num = Integer.parseInt(br.readLine());
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < num; i++)
            do {
                System.out.printf("x[%d]: ", i);
                x[i] = Integer.parseInt(br.readLine());
            } while (x[i] < x[i - 1]);

        System.out.print("검색할 값: ");
        int ky = Integer.parseInt(br.readLine());

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0)
            System.out.printf("그 값은 존재하지 않습니다. (삽입 포인트: %d)", -(idx + 1));
        else
            System.out.printf("그 값은 x[%d]에 있습니다.\n", idx);

        br.close();
    }
}
