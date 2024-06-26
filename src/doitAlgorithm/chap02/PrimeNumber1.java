package doitAlgorithm.chap02;

public class PrimeNumber1 {
    // 1000 이하의 소수를 나열하는 메서드 버전 1
    public static void main(String[] args) {
        int counter = 0;

        for (int n = 2; n <= 1000; n++) {
            int i;

            for (i = 2; i < n; i++) {
                counter++;

                if (n % i == 0) break;
            }

            if (n == i)
                System.out.println(n);
        }

        System.out.printf("나눗셈을 수행한 횟수: %d", counter);
    }
}
