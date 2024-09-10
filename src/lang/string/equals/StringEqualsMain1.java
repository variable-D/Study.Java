package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2)); // false 메모리 주소값이 다르기 때문
        System.out.println("new String() equals() 비교: " + str1.equals(str2)); // true 문자열 값이 같기 때문

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true 같은 리터럴을 참조하기 때문
        System.out.println("리터럴 equals() 비교: " + str3.equals(str4)); // true 문자열 값이 같기 때문
    }
}
