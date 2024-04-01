package doitAlgorithm.chap02;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int n = 5; n <= 1000; n += 2) {
            boolean flag = false;

            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2; // 루프 조건문 + 아래 if문

                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                prime[ptr++] = n;

                // 내부 루프를 마지막까지 돌렸을 때,
                // 루프의 조건문(prime[i] * prime[i] <= n)을 수행한 뒤 아래 counter += 2를 수행하지 않으므로,
                // 조건문 내의 곱셈횟수를 이곳에서 추가해줌.
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++)
            System.out.println(prime[i]);


        System.out.printf("곱셈과 나눗셈을 한 횟수: %d", counter);
    }
}
