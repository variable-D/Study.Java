package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ;
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
