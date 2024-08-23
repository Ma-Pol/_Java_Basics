package kyh_3_intermediate1.examples.enumeration.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
