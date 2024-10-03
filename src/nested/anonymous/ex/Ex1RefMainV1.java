package nested.anonymous.ex;


import java.util.Random;

public class Ex1RefMainV1 {
    public static void hello(Process process) {
    System.out.println("프로그램 시작");
    process.run();
    System.out.println("프로그램 종료");
  }

  static class Dice implements Process {
      @Override
      public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
      }
  }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();

        System.out.println("Hello 실행");
        hello(dice);
        hello(sum);
    }

    /* public static void main(String[] args) {
        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };
        Process sum = new Process() {
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
    }*/
}
