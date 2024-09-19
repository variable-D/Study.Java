package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate dt = LocalDate.of(year, month, 1);

        DayOfWeek firstDayOfWeek = dt.getDayOfWeek();
        DayOfWeek lastDayOfWeek = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek(); // 이번 달의 마지막 요일을 구한다.
        // TemporalAdjusters.lastDayOfMonth()는 이번 달의 마지막 날짜를 구한다.
        // 그리고 getDayOfWeek()는 해당 날짜의 요일을 구한다.

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
