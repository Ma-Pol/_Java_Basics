package kyh_3_intermediate1.lang.immutable.ex;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 불변 객체의 메서드 명은 withXXXX() 로 만드는 것이 관례이다.
    // 수정 사항을 포함하는 새 인스턴스를 반환한다는 사실을 뜻하기 때문이다.
    public ImmutableMyDate changeYear(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate changeMonth(int month) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate changeDay(int day) {
        return new ImmutableMyDate(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
