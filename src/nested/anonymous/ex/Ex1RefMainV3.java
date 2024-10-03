package nested.anonymous.ex;


import java.util.Random;

//익명 클래스 사용
public class Ex1RefMainV3 {
    public static void hello(Process process) {
    System.out.println("프로그램 시작");
    process.run();
    System.out.println("프로그램 종료");
  }


    public static void main(String[] args) {

        Process dice = new Process(){ //익명 클래스 생성 후 참조로 전달
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };
        Process sum = new Process() { //익명 클래스 생성 후 참조로 전달
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }

}
