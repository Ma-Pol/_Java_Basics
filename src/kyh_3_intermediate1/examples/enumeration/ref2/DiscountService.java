package kyh_3_intermediate1.examples.enumeration.ref2;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
