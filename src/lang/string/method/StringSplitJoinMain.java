package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";
        // split() 메서드는 문자열을 구분자로 나누어 배열로 반환한다.
        String[] splitStr = str.split(", ");
        for (String s : splitStr) {
            System.out.println(s);
        }

        //join() 메서드는 배열을 구분자로 연결하여 문자열로 반환한다.
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열: " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result); // result = Apple-Banana-Orange

    }
}