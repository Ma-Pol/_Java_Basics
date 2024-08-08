package kyh_start.cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 1200;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int exchanged = dollar * 1300;

            System.out.println("환전 금액은 " + exchanged + "원입니다.");
        }
    }
}
