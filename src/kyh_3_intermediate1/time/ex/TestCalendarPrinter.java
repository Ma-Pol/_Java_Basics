package kyh_3_intermediate1.time.ex;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // getDayOfWeek().getValue()
        // 월요일 = 1, 화요일 = 2, ... , 일요일 = 7
        // 1 % 7 == 1, 2 % 7 == 2, ... , 7 % 7 == 0
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.printf("\nSu Mo Tu We Th Fr Sa\n");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.printf("%2s ", "");
        }

        LocalDate dayIterator = firstDayOfMonth;

        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());

            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            dayIterator = dayIterator.plusDays(1);
        }
    }
}
