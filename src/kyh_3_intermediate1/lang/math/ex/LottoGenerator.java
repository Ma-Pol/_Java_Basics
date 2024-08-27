package kyh_3_intermediate1.lang.math.ex;

import java.util.Random;

public class LottoGenerator {
    private final Random r = new Random();
    private int[] lotto;
    private int count;

    public int[] generate() {
        lotto = new int[6];
        count = 0;

        while (count < 6) {
            int num = r.nextInt(45) + 1;

            if (!isDuplicate(num)) {
                lotto[count++] = num;
            }
        }

        return lotto;
    }

    // 중복된 값이 존재하면 true, 없으면 false를 반환
    private boolean isDuplicate(int target) {
        for (int i = 0; i < count; i++) {
            if (lotto[i] == target) {
                return true;
            }
        }

        return false;
    }
}
