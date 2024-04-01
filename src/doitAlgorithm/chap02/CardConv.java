package doitAlgorithm.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardConv {
    // 실습 2-6B : 2-6A의 활용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int no;                     // 변환하는 정수
        int cd;                     // 기수
        int dno;                    // 변환 후의 자릿수
        int retry;                  // 다시 한 번?
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환합니다.");

        // 전체 반복 과정
        do {
            // 변환할 정수 입력
            do {
                System.out.print("음이 아닌 정수: ");
                no = Integer.parseInt(br.readLine());
            } while (no < 0);

            // 변환할 기수 입력
            do {
                System.out.print("어떤 진수로 변환할까요? (2 ~ 36): ");
                cd = Integer.parseInt(br.readLine());
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);    // no를 cd진수로 변환

            System.out.printf("%d는 %d진수로 ", no, cd);

            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }

            System.out.println(" 입니다.\n");

            System.out.print("한번 더 실행할까요? (1.. 예 / 0.. 아니요): ");
            retry = Integer.parseInt(br.readLine());

        } while (retry == 1);

        br.close();
    }

    // 실습 2-6A : 입력받은 10진수 정숫값 x를 r진수로 변환 후, 그 자릿수을 반환하는 메서드
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }

        return digits;
    }
}
