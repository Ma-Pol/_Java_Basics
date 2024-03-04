// 2자리의 양수(10 ~ 99)를 입력

package doitAlgorithm.chap01.subChap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no;

        System.out.println("2자리의 양수를 입력하세요.");

        do {
            System.out.print("no의 값: ");
            no = Integer.parseInt(br.readLine());
        } while (no < 10 || no > 99);

        // 드모르간 법칙(De Morgan's laws)
        // 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고, 전체를 부정하면 원래의 조건과 같다.
        // !(no >= 10 && no <= 99) == no < 10 || no > 99

        System.out.printf("변수 no의 값은 %d(이)가 되었습니다.", no);

        br.close();
    }
}
