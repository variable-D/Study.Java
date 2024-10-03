package nested.test;

public class OuterClass2 {

    class InnerClass{
        public void hello() {
            System.out.println("Hello");
        }
    }

    /*
    내부 클래스(Inner Class)**의 인스턴스를 생성하기 위해서는 **바깥 클래스(Outer Class)**의 참조가 필요합니다. 내부 클래스는 바깥 클래스의 멤버로 존재하며, 바깥 클래스의 인스턴스에 연결되어 있기 때문에, 바깥 클래스의 인스턴스를 통해 내부 클래스의 인스턴스를 생성하고, 내부 클래스의 기능을 사용할 수 있습니다.
    */
}
