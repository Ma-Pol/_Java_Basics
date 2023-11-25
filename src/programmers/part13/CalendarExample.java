package programmers.part13;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);

        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second + "초");

        // 현재 인스턴스의 값을 변경 1
        cal.add(Calendar.YEAR, -1);
        cal.add(Calendar.HOUR, 5);

        year = cal.get(Calendar.YEAR);
        hour = cal.get(Calendar.HOUR);

        System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second + "초");

        // 현재 인스턴스의 값을 변경 2
        cal.set(2020, 8, 13);

        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        date = cal.get(Calendar.DATE);

        System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second + "초");
    }
}
