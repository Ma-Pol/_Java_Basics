package kyh_3_intermediate1.examples.enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}