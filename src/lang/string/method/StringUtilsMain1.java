package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();;
        String str = "Hello, Java!";

        //valueOf()는 기본 타입의 값을 문자열로 변환하여 반환
        String numString = String.valueOf(num); //문자 100으로 변환
        System.out.println("numString = " + numString);
        String boolString = String.valueOf(bool); //문자 true로 변환
        System.out.println("boolString = " + boolString);
        String objString = String.valueOf(obj); //문자 java.lang.Object@15db9742로 변환
        System.out.println("objString = " + objString);
        String strString = String.valueOf(str); //문자 Hello, Java!로 변환
        System.out.println("strString = " + strString);

        // 문자 + x -> 문자
        String numString2 = num + ""; //문자 100으로 변환
        System.out.println("numString2 = " + numString2);

        //toCharArray()는 문자열을 문자 배열로 변환하여 반환
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
