package doitAlgorithm.practice.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수: ");
        int num = Integer.parseInt(br.readLine());
        int[] x = new int[num];

        System.out.println("오름차순으로 입력해주세요.");

        System.out.print("x[0]: ");
        x[0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < num; i++) {
            do {
                System.out.printf("x[%d]: ", i);
                x[i] = Integer.parseInt(br.readLine());
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값: ");
        int ky = Integer.parseInt(br.readLine());

        int idx = binSearchX(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.printf("그 값은 x[%d]에 있습니다.\n", idx);

        br.close();
    }

    static int binSearchX(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;

            if (a[pc] == key) {
                while (a[pc - 1] == key) {
                    pc--;
                }

                return pc;
            } else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }
}
