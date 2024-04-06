package doitAlgorithm.practice.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {
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

        int idx = binSearch(x, num, ky);

        if (idx == -1)
            System.out.printf("\n%d의 요소가 없습니다.\n", ky);
        else
            System.out.printf("\n%d은(는) x[%d]에 있습니다.\n", ky, idx);

        br.close();
    }

    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        System.out.printf("\n%3s|", " ");

        for (int i = 0; i < n; i++)
            System.out.printf("%3d", i);

        System.out.printf("\n%3s+", "---");

        for (int i = 0; i < n; i++)
            System.out.printf("%3s", "---");

        System.out.println();

        do {
            int pc = (pl + pr) / 2;

            System.out.printf("%3s|", " ");

            for (int i = 0; i <= pr; i++) {
                if (i == pl)
                    System.out.printf("%3s", "<-");
                else if (i == pc)
                    System.out.printf("%3s", "+");
                else if (i == pr)
                    System.out.printf("%3s", "->");
                else
                    System.out.printf("%3s", " ");
            }

            System.out.printf("\n%3d|", pc);

            for (int i = 0; i < n; i++)
                System.out.printf("%3d", a[i]);

            System.out.println();

            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }
}
