package lang.string.immutable;

public class Stringimmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1); // str = hello
        System.out.println("str2 = " + str2); // str2 = hello java
    }
}
