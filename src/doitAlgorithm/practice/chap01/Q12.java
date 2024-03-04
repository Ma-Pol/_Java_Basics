package doitAlgorithm.practice.chap01;

public class Q12 {
    public static void main(String[] args) {
        for(int i = 0; i <= 9; i++)
            if (i == 0)
                System.out.printf("%2s%2s", " ", "|");
            else
                System.out.printf("%3d", i);

        System.out.print("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.println();

            for (int j = 0; j <= 9; j++)
                if (j == 0)
                    System.out.printf("%2d%2s", i, "|");
                else
                    System.out.printf("%3d", i + j);
        }
    }
}
