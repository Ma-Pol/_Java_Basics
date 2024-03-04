// 입력한 정숫값의 부호(양수/음수/0)를 판단

package doitAlgorithm.chap01.subChap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JudgeSign {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력하세요: ");
        int n = Integer.parseInt(br.readLine());

        if (n > 0) {
            System.out.print("이 수는 양수입니다.");
        } else if (n < 0) {
            System.out.print("이 수는 음수입니다.");
        } else {
            System.out.print("이 수는 0입니다.");
        }

        br.close();
    }
}
