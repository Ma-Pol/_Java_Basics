package kyh_4_advanced1.thread.executor.ex;

import java.util.concurrent.ExecutionException;

public class OldOrderServiceTestMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String orderNo = "Order#1234"; // 예시 주문 번호
        OldOrderService oldOrderService = new OldOrderService();
        oldOrderService.order(orderNo);
    }
}
