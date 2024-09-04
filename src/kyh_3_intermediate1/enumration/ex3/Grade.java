package kyh_3_intermediate1.enumration.ex3;

public enum Grade {
    BASIC, GOLD, DIAMOND;
}

/*
위 코드는 아래와 거의 일치한다.
public class Grade extends Enum {
    public static final Grade BASIC = new Grade();
    public static final Grade GOLD = new Grade();
    public static final Grade DIAMOND = new Grade();

    private Grade() {
    }
}
 */
