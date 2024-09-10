package lang.string.method;

import lang.object.Parent;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format()은 지정된 형식의 문자열을 반환
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        //printf()는 지정된 형식의 문자열을 출력
        System.out.printf("숫자: %.2f\n", 10.1234);

        //matches()는 정규 표현식과 일치하는지 여부를 반환
        String regex = "Hello, (Java!|World!)";
        System.out.println("'str' 이 패턴과 일치라는가? " + str.matches(regex)); //Hello, Java! 또는 Hello, World!와 일치하면 true 반환
        // 정규표현식이란 문자열의 패턴을 정의하는 문자열 표현식 ex) Hello, (Java!|World!) -> Hello, Java! 또는 Hello, World!와 일치

    }
}
