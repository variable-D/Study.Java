package nested.anonymous.ex;


import java.util.Random;

public class Ex1RefMainV5  {
    public static void hello(Process process) {
    System.out.println("프로그램 시작");
    process.run();
    System.out.println("프로그램 종료");
  }


    public static void main(String[] args) {

        System.out.println("Hello 실행");
        // 람다식 코드
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        // 람다식 코드
        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }

    /*
    1.	람다식:
	•	추상 메서드가 하나만 있는 함수형 인터페이스에서만 사용할 수 있습니다.
	•	즉, 추상 메서드가 하나만 있으면 람다식으로 간결하게 구현할 수 있습니다.
	2.	익명 클래스:
	•	추상 메서드가 하나만 있든 여러 개가 있든 모두 구현 가능합니다.
	•	하지만 추상 메서드가 여러 개일 경우, 익명 클래스에서는 그 모든 추상 메서드를 오버라이딩해야 합니다.
	•   변수 선언도 가능 하다.

즉, 람다식은 추상 메서드가 하나일 때만 사용 가능하고, 익명 클래스는 추상 메서드가 몇 개가 있든 전부 구현해야 한다는 점에서 차이가 있습니다.
*/
}
