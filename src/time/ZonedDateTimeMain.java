package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now(); // 현재 날짜시간 (기본 타임존)
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50); // 2030년 1월 1일 13시 30분 50초 임의로 지정
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul")); // 2030년 1월 1일 13시 30분 50초 (서울) 임의로 지정
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));// 2030년 1월 1일 13시 30분 50초 (서울) 임의로 지정 하지만 나노세컨드까지 지정 해야함.
        System.out.println("zdt2 = " + zdt2);


        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));// UTC로 변환 (서울 -> UTC) 타임존을 변경함.
        System.out.println("utcZdt = " + utcZdt);
    }
}