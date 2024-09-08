package kyh_3_intermediate1.time.ex;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);

        Period between = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.printf("남은 기간: %d년 %d개월 %d일\n",
                between.getYears(), between.getMonths(), between.getDays());
        System.out.printf("디데이: %d일 남음\n", daysBetween);
    }
}
