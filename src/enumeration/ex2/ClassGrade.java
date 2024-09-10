package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 생성자를 private으로 선언하여 외부에서 인스턴스를 생성하지 못하도록 함
    private ClassGrade() {
    }
}
