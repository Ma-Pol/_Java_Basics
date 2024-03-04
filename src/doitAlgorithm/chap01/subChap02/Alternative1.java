// +와 -를 번갈아 출력(1)

package doitAlgorithm.chap01.subChap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alternative1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n의 값: ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }

//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 1) {
//                System.out.print("+");
//            } else {
//                System.out.print("-");
//            }
//        }

        br.close();
    }
}
