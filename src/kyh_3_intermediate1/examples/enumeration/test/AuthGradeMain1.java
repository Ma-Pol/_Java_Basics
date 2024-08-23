package kyh_3_intermediate1.examples.enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade=" + value.name() + ", level=" + value.getLevel() + ", 설명=" + value.getDescription());
        }
    }
}
