package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Filter;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.of(2024,1,1);

        for(int i = 0; i < 5; i++) {
            LocalDate plus = dt.plus(2 * i, ChronoUnit.WEEKS); // 2주씩 증가 0, 2, 4, 6, 8 순으로 증가
            System.out.println("날짜" + (i+1) + ": " + plus);
        }
    }
}
