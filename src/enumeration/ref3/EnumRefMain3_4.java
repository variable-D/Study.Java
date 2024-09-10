package enumeration.ref3;

public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printGrade(grade, price);
        }

    }

    public static void printGrade(Grade grade, int price) {
        System.out.println(grade + " 등급의 할인 금액 : " + grade.discount(price));
    }
}