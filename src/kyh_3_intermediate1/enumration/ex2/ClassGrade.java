package kyh_3_intermediate1.enumration.ex2;

// 타입 안전 열거형 패턴(Type-Safe Enum Pattern)
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가
    private ClassGrade() {
    }
}
