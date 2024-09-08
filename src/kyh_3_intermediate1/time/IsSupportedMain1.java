package kyh_3_intermediate1.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // LocalDate는 시간 정보가 없으므로
        int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 분/초에 대한 조회가 불가능
        System.out.println("minute = " + minute);
    }
}
