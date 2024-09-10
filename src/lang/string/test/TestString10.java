package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        for (String fruit : split) {
            System.out.println(fruit);
        }

        String join = fruits.join("->", split);
        System.out.println(join);

    }
}
