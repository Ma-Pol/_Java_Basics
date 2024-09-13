package kyh_3_intermediate1.enumration.ex1;

import kyh_3_intermediate1.enumration.ex0.DiscountService;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        kyh_3_intermediate1.enumration.ex0.DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);
    }
}