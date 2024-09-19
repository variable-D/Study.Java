package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1); // 해당 월의 1일
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); // 다음 달의 1일

        // 월요일 = 1(1%7=1) ... 일요일 = 7(7%7=0) 이므로 7로 나눈 나머지를 구하면 해당 요일을 알 수 있다.
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7; // 해당 월의 1일이 무슨 요일인지 구한다.

        System.out.println("Su Mo Tu We Th Fr Sa");

        // 해당 월의 1일이 무슨 요일인지 구한다. 그리고 해당 요일까지 공백을 출력한다.
        // offsetWeekDays 값의  전까지 공백을 출력한다.
        for(int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) { // 해당 월의 1일부터 다음 달의 1일 전까지 반복
            System.out.printf("%2d ", dayIterator.getDayOfMonth()); // 해당 날짜를 출력
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) { // 토요일 마다 줄바꿈
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1); // 다음 날짜로 이동
        }
    }
}
