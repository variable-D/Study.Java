package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now(); // 현재 날짜시간 (기본 타임존)
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50); // 2030년 1월 1일 13시 30분 50초 임의로 지정
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00")); // 2030년 1월 1일 13시 30분 50초 (서울) 임의로 지정 오프셋 시간을 지정해야함.
        System.out.println("odt = " + odt);

        /*
        * 타임존 (ZoneId):

        타임존은 특정 지역의 표준 시간을 나타내며, 시간대 규칙을 포함합니다. 예를 들어, Asia/Seoul, America/New_York 같은 지역별 시간대를 나타냅니다.
        타임존은 그 지역에서의 현재 시간을 결정하며, 서머타임(DST)과 같은 규칙이 적용될 수 있습니다.
        오프셋 (ZoneOffset):

        오프셋은 단순히 UTC(협정 세계시)와의 시간차를 나타냅니다. 예를 들어, +09:00(UTC보다 9시간 빠름) 또는 -05:00(UTC보다 5시간 늦음) 등입니다.
        오프셋은 고정된 시간차만을 표현하며, 서머타임이나 다른 시간대 규칙과는 무관합니다.
        예를 들어:
        OffsetDateTime 객체는 오프셋만을 포함합니다. 예를 들어 2030-01-01T13:30:50+01:00는 UTC보다 1시간 빠른 시간을 나타냅니다. 이 경우 시간대 정보는 포함되지 않으며, 시간차만 고정적으로 나타냅니다.

        ZonedDateTime 객체는 타임존을 포함합니다. 예를 들어 2030-01-01T13:30:50+09:00[Asia/Seoul]은 서울 시간대에서의 시간을 나타내며, 시간대 규칙에 따라 자동으로 시간 계산이 이루어집니다.

        결론:
        **OffsetDateTime**은 타임존 없이 오프셋만을 기반으로 시간과 날짜를 나타냅니다. 이 경우 UTC와의 시간차만을 고려합니다.
        **ZonedDateTime**은 타임존을 포함하여 더 복잡한 시간대 규칙을 처리할 수 있습니다.
        따라서, OffsetDateTime은 고정된 시간차를 표현할 때 사용하고, ZonedDateTime은 타임존과 관련된 규칙을 고려하여 날짜와 시간을 관리할 때 사용합니다.
      * */
    }
}