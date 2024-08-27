package kyh_3_intermediate1.lang.math.ex;

import java.util.Arrays;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lotto = lottoGenerator.generate();

        Arrays.sort(lotto);

        System.out.print("로또 번호: ");
        for (int num : lotto) {
            System.out.print(num + " ");
        }
    }
}
