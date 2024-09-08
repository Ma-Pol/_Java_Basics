package kyh_3_intermediate1.time.ex;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            System.out.printf("날짜 %d: %s\n", (i + 1), now.plusWeeks((2 * i)));
        }
    }
}
