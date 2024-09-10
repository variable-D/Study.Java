package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        //Stirng -> Integer
        Integer integer1 = Integer.valueOf(str);
        //Integer -> int
        int intValue = integer1.intValue();
        //int -> Integer
        Integer integer2 = Integer.valueOf(intValue);

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
