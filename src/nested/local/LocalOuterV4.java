package nested.local;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        // localVar = 10; // 컴파일 오류
        // localVar = 10; // 컴파일 오류
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2); // 참조 값을 반환한다. 그래서 이 코드가 필요하다. 그리고 매개변수를 인자 2로 전달한다.
        printer.print(); // 참조값을 통해 메서드를 호출한다. 만약 LocalPrinter 가 x001 이라면 x001.print()를 호출한다.
    }
}
