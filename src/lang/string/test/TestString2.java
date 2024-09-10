package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        System.out.println("hello : " + arr[0].length());
        System.out.println("java : " + arr[1].length());
        System.out.println("jvm : " + arr[2].length());
        System.out.println("spring : " + arr[3].length());
        System.out.println("jpa : " + arr[4].length());

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
              sum += arr[i].length();
        }
        System.out.println("sum : " + sum);

    }
}
