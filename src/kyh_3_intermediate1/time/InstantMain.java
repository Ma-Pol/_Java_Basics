package kyh_3_intermediate1.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 현재 시간을 기준으로 생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        // 다른 타입의 날짜와 시간을 기준으로 생성
        // ※ UTC를 기준으로 하기 때문에 시간대 정보가 필요하다.
        //   => LocalDateTime 사용 불가
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        // 에포크 시간을 기준으로 생성
        // 0초 = 1970년 1월 1일 0시 0분 0초
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        // plusSeconds(): 초를 더한다.
        // 이 외 밀리초, 나노초를 더하는 메서드만 제공
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        // getEpochSecond(): 에포크 시간을 기준으로 흐른 초를 반환
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
