package kyh_4_advanced1.thread.bounded;

import static kyh_4_advanced1.util.MyLogger.log;

// 데이터를 생산하는 생산자 스레드가 실행하는 클래스
public class ProducerTask implements Runnable {
    private BoundedQueue queue;
    private String request;

    public ProducerTask(BoundedQueue queue, String request) {
        this.queue = queue;
        this.request = request;
    }

    @Override
    public void run() {
        log("[생산 시도] " + request + " -> " + queue);
        queue.put(request);
        log("[생산 완료] " + request + " -> " + queue);
    }
}
