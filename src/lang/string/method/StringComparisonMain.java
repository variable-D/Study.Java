package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java"; // 대문자 일부 있음
        String str2 = "hello, java"; // 대문자 없음 모두 소문자
        String str3 = "Hello, World";

        System.out.println("str1 equals str2: " + str1.equals(str2)); // false
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); // true

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // 1
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3)); // 0
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2)); // 32

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello")); // true
        System.out.println("str1 ends with 'Java': " + str1.endsWith("Java")); // true
    }
}
