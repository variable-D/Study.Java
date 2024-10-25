package exception.ex1;

import java.util.Scanner;

// 예외 처리가 필요한 이유3 - 반환 값으로 예외 처리 강의에서 사용하는 MainV1_1.java 이다.

public class MainV1_1 {
    public static void main(String[] args) {

//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
