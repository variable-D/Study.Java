package nested.local;

public class LocalOuterV1 {
    public int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        class LocalPrinter{ // 접근 제한자를 가질 수 없다.
            int value = 0;

            public void printDate() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printDate();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
