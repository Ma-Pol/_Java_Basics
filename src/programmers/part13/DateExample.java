package programmers.part13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss zzz");
        System.out.println(sdf.format(date));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println(sdf.format(date));

        System.out.println("date.getTime() : " + date.getTime());

        long today = System.currentTimeMillis();
        System.out.println("System.currentTimeMillis() : " + today);

        System.out.println("today - date.getTime() : " + (today - date.getTime()) + "ms");
    }
}
