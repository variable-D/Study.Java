package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";

        String filemane = str.substring(0, 5);
        String extName = str.substring(5);

        System.out.println("filename = " + filemane);
        System.out.println("extName = " + extName);
    }
}
