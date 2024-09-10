package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10); // 10% 할인
    public static final ClassGrade GOLD = new ClassGrade(20); // 20% 할인
    public static final ClassGrade DIAMOND = new ClassGrade(30); // 30% 할인

    private final int discountPercent;


    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

}
