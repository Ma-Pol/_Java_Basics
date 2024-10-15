package kyh_4_advanced1.thread.executor.reject;

import kyh_4_advanced1.thread.executor.RunnableTask;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static kyh_4_advanced1.util.MyLogger.log;

public class RejectMainV4 {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(1, 1,
                0, TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new MyRejectedExecutionHandler()); // Executor 예외 정책(사용자 정의)

        es.submit(new RunnableTask("task1"));
        es.submit(new RunnableTask("task2")); // 무시, 경고 1회
        es.submit(new RunnableTask("task3")); // 무시, 경고 2회

        es.close();
    }

    private static class MyRejectedExecutionHandler implements RejectedExecutionHandler {
        static AtomicInteger count = new AtomicInteger(0);

        // 거절된 작업은 그대로 버리되, 경고 로그를 남기도록 한다.
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            int i = count.incrementAndGet();
            log("[경고] 거절된 누적 작업 수: " + i);
        }
    }
}
