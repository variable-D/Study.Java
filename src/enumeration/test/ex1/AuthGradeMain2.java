package enumeration.test.ex1;

import enumeration.test.AuthGrade;
import lang.system.SystemMain;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN] : ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + " 입니다.");

        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }



   /*  내가 작성한 코드 영한님 코드와 나의 코드를 보고 느낀점은 나는 너무 복잡하게 생각했다.
        그리고 if문을 화룡해서 더 간단하게 코드를 작성할 수 있었다. 이 점이 정말 유익하다 생각이 들고 그리고 이런식으로도 코드를 작성할 수 있다는 것을 알게 되었다.
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("당신의 등급을 입력하세요 : ");
            String authGradeName = scanner.nextLine();
            printAuthGrade(AuthGrade.valueOf(authGradeName));
        }
    }

    private static void printAuthGrade(AuthGrade authGrade) {
        if (authGrade.name().equals("GUEST")) {
            System.out.println("당신의 등급은 " + authGrade.name()+ " 입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
        } else if(authGrade.name().equals("LOGIN")) {
            System.out.println("당신의 등급은 " + authGrade.name()+ " 입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if(authGrade.name().equals("ADMIN")) {
            System.out.println("당신의 등급은 " + authGrade.name()+ " 입니다.");
            System.out.println("==메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }
    }*/


}
