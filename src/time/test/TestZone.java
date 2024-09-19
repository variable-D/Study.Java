package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul")); // 마지막에 ZoneId.of("Asia/Seoul")을 추가하여 서울 시간대로 설정
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London")); // withZoneSameInstant()를 사용하여 서울 시간대를 런던 시간대로 변경
        ZonedDateTime newYorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York")); // withZoneSameInstant()를 사용하여 서울 시간대를 뉴욕 시간대로 변경
        // 그리고 공통적으로 withZoneSameInstant()를 사용하면 인자로 zonedId를 작성을 해야 한다. 그리고 해당 시간대로 변경된다.

        System.out.println("서울 회의 시간:" + seoulTime);
        System.out.println("런던 회의 시간:" + londonTime);
        System.out.println("뉴욕 회의 시간:" + newYorkTime);
    }
}
