package kyh_4_advanced1.thread.bounded;

import static kyh_4_advanced1.util.MyLogger.log;

// 데이터를 소비하는 소비자 스레드가 실행하는 클래스
public class ConsumerTask implements Runnable {
    private BoundedQueue queue;

    public ConsumerTask(BoundedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        log("[소비 시도]     ? <- " + queue);
        String data = queue.take();
        log("[소비 완료] " + data + " <- " + queue);
    }
}
