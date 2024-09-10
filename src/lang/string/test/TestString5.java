package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

       int exIndex = str.indexOf(ext);

       String filename = str.substring(0, exIndex);
       String extName = str.substring(exIndex);

         System.out.println("filename = " + filename);
            System.out.println("extName = " + extName);
    }
}
