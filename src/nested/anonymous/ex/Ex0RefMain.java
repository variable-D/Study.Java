package nested.anonymous.ex;

public class Ex0RefMain {
    public static void hello(String string) {
        System.out.println("프로그램 시작"); // 변하지 않는 코드
        System.out.println("Hello" + string); // 변하는 코드 (string에 따라 변함)
        System.out.println("프로그램 종료"); // 변하지 않는 코드
    }

    public static void main(String[] args) {
        hello(" Java"); // 변하는 코드
        hello(" Spring"); // 변하는 코드
    }
}
