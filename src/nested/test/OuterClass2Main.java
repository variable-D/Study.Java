package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2(); // 바깥 클래스 객체 생성.
        OuterClass2.InnerClass inner = outer.new InnerClass(); //  바깥 클래스 인스턴스를 통해서 내부 클래스 객체 생성.
        inner.hello();
    }
}
