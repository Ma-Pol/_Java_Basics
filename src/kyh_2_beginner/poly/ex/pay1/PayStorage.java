package kyh_2_beginner.poly.ex.pay1;

public abstract class PayStorage {
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new FailPay();
        }
    }
}
