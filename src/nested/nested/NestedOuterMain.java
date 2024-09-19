package nested.nested;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested(); // NestedOuter.Nested 클래스의 객체 생성
        nested.print();

        System.out.println("nestedClass" + nested.getClass());
        // nestedClass class nested.nested.NestedOuter$Nested 안쪽 클래스의 이름을 $로 구분한다.

        LocalDate startDate = LocalDate.of(2024, 9, 20);
        LocalDate endDate = LocalDate.of(2024, 10, 6);

        Period between = Period.between(startDate, endDate);
        long between1 = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("between1 = " + between1);

    }
}
