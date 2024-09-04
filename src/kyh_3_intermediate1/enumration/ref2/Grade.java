package kyh_3_intermediate1.enumration.ref2;

public enum Grade {
    BASIC(10),
    GOLD(20),
    DIAMOND(30);

    private final int discountPercent;

    // 열거형 생성자의 접근제어자는 선언할 수 없으며, 기본적으로 private 이다.
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 열거형도 기본적으로 클래스이므로 메서드를 추가할 수 있다.
    public int getDiscountPercent() {
        return discountPercent;
    }
}
