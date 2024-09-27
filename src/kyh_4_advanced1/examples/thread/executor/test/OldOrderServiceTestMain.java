package kyh_4_advanced1.examples.thread.executor.test;

public class OldOrderServiceTestMain {

    public static void main(String[] args) {
        String orderNo = "Order#1234";  // 예시 주문 번호
        OldOrderService orderService = new OldOrderService();
        orderService.order(orderNo);
    }

}