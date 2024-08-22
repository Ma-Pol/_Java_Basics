package kyh_2_beginner.poly.ex.pay1_mine;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
                amount);

        boolean result = false;
        boolean worngOption = true;

        for (String opt : PayStorage.payStorage.keySet()) {
            if (option.equals(opt)) {
                result = PayStorage.payStorage.get(option).pay(amount);
                worngOption = false;
            }
        }

        if (worngOption) {
            System.out.println("결제 수단이 없습니다.");
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
