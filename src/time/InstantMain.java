package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // 현재 날짜시간 (UTC)
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);// ZonedDateTime -> Instant
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);// 1970-01-01T00:00:00Z
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);// 1970-01-01T01:00:00Z
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();// 초
        System.out.println("laterEpochSecond = " + laterEpochSecond);

    }
}
