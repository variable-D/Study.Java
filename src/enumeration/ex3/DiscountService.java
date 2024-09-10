package enumeration.ex3;

public class DiscountService {
    public int discount(Grade grade, int price){
        int discountPersent = 0;
        //enum switch 변경 가능
        if (grade == Grade.BASIC) {
            discountPersent = 10;
        } else if (grade == Grade.GOLD) {
            discountPersent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPersent = 30;
        }else {
            System.out.println("할인X");
        }
        return price * discountPersent / 100;
    }
}