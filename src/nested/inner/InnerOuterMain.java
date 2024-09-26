package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        /* 생성 방법 주의 outer.new Inner() 이렇게 생성해야 한다.
        * 내부 클래스는 외부 클래스의 인스턴스에 종속되어 있는 클래스입니다. 그래서 내부 클래스의 객체를 생성하려면 해당 외부 클래스의 인스턴스가 필요합니다. 이는 내부 클래스가 외부 클래스의 멤버(필드나 메서드)에 직접 접근할 수 있도록 하기 위한 것입니다.
         여기서 outer.new Inner()는 outer라는 외부 클래스의 인스턴스와 연결된 내부 클래스의 객체를 생성하는 것입니다. 이렇게 생성된 inner 객체는 outer 객체의 멤버에 접근할 수 있습니다.
         * */
        inner.print();

        System.out.println("innerClass" + inner.getClass());
    }
}
