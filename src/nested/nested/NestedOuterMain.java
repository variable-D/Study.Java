package nested.nested;


public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested(); // NestedOuter.Nested 클래스의 객체 생성
        nested.print();

        System.out.println("nestedClass" + nested.getClass());
        // nestedClass class nested.nested.NestedOuter$Nested 안쪽 클래스의 이름을 $로 구분한다.

    }
}
