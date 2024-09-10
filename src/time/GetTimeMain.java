package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        // get 메서드로 모든걸 다 가져올 수 있음.  ChronoField 를 사용하여 가져올 수 있음. get 으로 enum 값을 가져올 수 있음.
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR)); // 년도 2030
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR)); // 월 1 ~ 12  1월이 1
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH)); // 일 1 ~ 31  1일이 1
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY)); // 시간 0 ~ 23 13시가 13
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR)); // 분 0 ~ 59 30분이 30
        System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE)); // 초 0 ~ 59  59초가 59

        System.out.println();
        // 위 방법은 번거롭기 때문에 편의 메서드를 사용하는 것이 좋음.
        System.out.println("편의 메서드 사용");
        System.out.println("YEAR = " + dt.getYear());
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue()); // getMonth() 는 Month 타입을 반환함. 그래서 getMonthValue() 를 사용해야함.
        System.out.println("DAY_OF_MONTH = " + dt.getDayOfMonth());
        System.out.println("HOUR_OF_DAY = " + dt.getHour());
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute());
        System.out.println("SECOND_OF_MINUTE = " + dt.getSecond());
        System.out.println();

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));
    /*
          *MINUTE_OF_DAY**는 자정으로부터 몇 분이 경과했는지를 계산하여 반환합니다.
    •	LocalDateTime 객체 dt는 13시 30분 59초를 나타내므로, 자정에서부터 13시 30분까지의 경과 시간을 분으로 계산합니다.
	•	계산 방법은 다음과 같습니다:
	•	13시간은 13 * 60 = 780분
	•	추가로 30분을 더하면 780 + 30 = 810분
	•	그래서 출력은 810이 맞습니다.*/

        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));
        /*
    •	**SECOND_OF_DAY**는 자정으로부터 몇 초가 경과했는지를 계산하여 반환합니다.
	•	같은 방식으로, 13시 30분 59초까지의 경과 시간을 초로 변환합니다.
	•	계산 방법은 다음과 같습니다:
	•	13시간은 13 * 3600 = 46800초
	•	30분은 30 * 60 = 1800초
	•	추가로 59초를 더하면 46800 + 1800 + 59 = 48659초
	•	그래서 출력은 48659초가 됩니다.
        * */
    }
}
