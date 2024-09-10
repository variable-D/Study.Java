package enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        printGrade(Grade.BASIC, price);
        printGrade(Grade.GOLD, price);
        printGrade(Grade.DIAMOND, price);
    }

    public static void printGrade(Grade grade, int price) {
        System.out.println(grade + " 등급의 할인 금액 : " + grade.discount(price));
    }
}