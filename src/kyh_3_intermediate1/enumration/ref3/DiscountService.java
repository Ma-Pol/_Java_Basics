package kyh_3_intermediate1.enumration.ref3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
