package kyh_4_advanced1.thread.executor.reject;

import kyh_4_advanced1.thread.executor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RejectMainV2 {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(1, 1,
                0, TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new ThreadPoolExecutor.DiscardPolicy()); // Executor 예외 정책(작업을 무시하고, 예외를 발생시키지 않음)

        es.submit(new RunnableTask("task1"));
        es.submit(new RunnableTask("task2")); // 무시
        es.submit(new RunnableTask("task3")); // 무시

        es.close();
    }
}
