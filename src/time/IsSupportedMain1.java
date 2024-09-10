package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        /*
        ChronoField.SECOND_OF_MINUTE 는 지원하지 않음.
        * 이유는 현재 now는 시간은 없기 때문이다. LocalDate는 시간을 가지고 있지 않다. 그래서 시간을 가져오려고 하면 에러가 발생한다.
        */
        System.out.println("minute = " + minute);
    }
}
