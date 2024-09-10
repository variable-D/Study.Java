package enumeration.test.ex1;

import enumeration.test.AuthGrade;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            System.out.println("Grade = " + authGrade.name() + ", level = " + authGrade.getLevel()+ ", 설명 = " + authGrade.getDescription());
        }
    }


   /* 내가 작성한 코드 영한님 코드와 나의 코드를 보고 느낀점은 나는 너무 복잡하게 생각했다.
   public static void main(String[] args) {
        printAuthGrade(AuthGrade.GUEST);
        printAuthGrade(AuthGrade.LOGIN);
        printAuthGrade(AuthGrade.ADMIN);
    }

    public static void printAuthGrade(AuthGrade authGrade) {
        System.out.println("Grade = " + authGrade.name() + ", level = " + authGrade.getLevel()+ ", 설명 = " + authGrade.getDescription());
    }*/
}
