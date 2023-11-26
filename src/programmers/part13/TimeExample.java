package programmers.part13;

import java.time.*;

public class TimeExample {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate ld1 = LocalDate.of(2020, Month.DECEMBER, 31);
        System.out.println(ld1);

        LocalTime lt1 = LocalTime.of(16, 39, 22);
        System.out.println(lt1);

        LocalTime lt2 = LocalTime.parse("16:39:22");
        System.out.println(lt2);

        LocalDate ld2 = timePoint.toLocalDate();
        System.out.println(ld2);

        LocalTime lt3 = timePoint.toLocalTime();
        System.out.println(lt3);

        System.out.println(timePoint.getMonth()); // Month 타입
        System.out.println(timePoint.getMonthValue());

    }
}
