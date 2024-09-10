package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜를 문자로
        LocalDate date = LocalDate.of(2024, 12, 31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"); // 포맷팅 패턴을 지정
        /*
        * 날짜를 문자열로 변환할 때 사용하는 DateTimeFormatter 클래스
        * ofPattern() 메소드로 포맷팅 패턴을 지정
        * yyyy : 년도
        * MM : 월
        * dd : 일
        * 형식에 맞게 문자열로 변환
        * */

        String formattedDate = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅: " + formattedDate);

        // 파싱 : 문자를 날짜로
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter); // formatter를 사용하여 문자열을 날짜로 파싱
        /*
        * 포맷팅 패턴과 입력 문자열이 일치해야 함.
        * 포맷팅 패턴에 맞게 입력 문자열을 작성해야 함.
        * 포맷팅 패턴에 맞게 입력 문자열을 작성하지 않으면 DateTimeParseException 발생
        * 그 기준으로 yyyy년 MM월 dd일 이므로 2030년 01월 01일 이렇게 입력해야함.
        * 그럼 yyyy = 2030, MM = 01, dd = 01 이렇게 파싱이 됨.
        * */
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDate);

    }
}
