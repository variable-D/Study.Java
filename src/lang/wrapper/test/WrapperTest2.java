package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String [] strArray = {"1.5", "2.5", "3.0"};
        double sum = 0;
        for (String i : strArray) {
            sum += Double.parseDouble(i);
        }
        System.out.println("sum = " + sum);
    }
}
