package doitAlgorithm.practice.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int no;
        int cd;
        int dno;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");

        do {
            System.out.print("음이 아닌 정수: ");
            no = Integer.parseInt(br.readLine());
        } while (no < 0);

        do {
            System.out.print("어떤 진수로 변환할까요? (2 ~ 36): ");
            cd = Integer.parseInt(br.readLine());
        } while (cd < 2 || cd > 36);

        dno = cardConv(no, cd, cno);

        System.out.printf("%d는 %d진수로 ", no, cd);

        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }

        System.out.println(" 입니다.");


        br.close();
    }

    static int cardConv(int x, int r, char[] d) {
        System.out.println();

        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            System.out.printf("%3d | %10d", r, x);

            if (digits != 0)
                System.out.printf(" ... %c", d[digits - 1]);

            System.out.printf("\n%3s + ----------\n", " ");

            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        System.out.printf("%16d ... %c\n", x, d[digits - 1]);

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }

        return digits;
    }
}
