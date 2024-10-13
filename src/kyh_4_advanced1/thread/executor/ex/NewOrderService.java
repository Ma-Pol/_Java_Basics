package kyh_4_advanced1.thread.executor.ex;

import java.util.List;
import java.util.concurrent.*;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class NewOrderService {
    private final ExecutorService es = Executors.newFixedThreadPool(3);

    public void order(String orderNo) throws ExecutionException, InterruptedException {
        Work inventoryWork = new InventoryWork(orderNo);
        Work shippingWork = new ShippingWork(orderNo);
        Work accountingWork = new AccountingWork(orderNo);

        List<Work> works = List.of(inventoryWork, shippingWork, accountingWork);

        try {
            List<Future<Boolean>> futures = es.invokeAll(works);

            for (Future<Boolean> future : futures) {
                if (!future.get()) {
                    log("일부 작업이 실패했습니다.");
                    return;
                }
            }

            log("모든 주문 처리가 성공적으로 완료되었습니다.");
        } finally {
            es.close();
        }
    }

    private static class InventoryWork extends Work {
        public InventoryWork(String orderNo) {
            super(orderNo);
            system = "재고 업데이트";
        }
    }

    private static class ShippingWork extends Work {
        public ShippingWork(String orderNo) {
            super(orderNo);
            system = "배송 시스템 알림";
        }
    }

    private static class AccountingWork extends Work {
        public AccountingWork(String orderNo) {
            super(orderNo);
            system = "회계 시스템 업데이트";
        }
    }

    private static class Work implements Callable<Boolean> {
        private final String orderNo;
        String system;

        public Work(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log(system + ": " + orderNo);
            sleep(1000);
            return true;
        }
    }

}



