package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1 );
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate); // 두 날짜 사이의 차이를 구한다. 반환 값은 Period 타입이다.
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate); // 두 날짜 사이의 차이를 구한다. 반환 값은 long 타입이다.
        // 위 period 반환 값을 토대로 년, 월, 일을 구할 수 있다. 그리고 daysBetween은 두 날짜 사이의 차이를 일 단위로 구한다.
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("디데이: " + daysBetween+ "일 남음");
    }
}
