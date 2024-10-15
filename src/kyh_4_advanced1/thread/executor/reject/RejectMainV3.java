package kyh_4_advanced1.thread.executor.reject;

import kyh_4_advanced1.thread.executor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RejectMainV3 {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(1, 1,
                0, TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new ThreadPoolExecutor.CallerRunsPolicy()); // Executor 예외 정책(작업을 호출한 스레드가 직접 수행하게 함)

        es.submit(new RunnableTask("task1")); // thread-1 스레드가 수행
        es.submit(new RunnableTask("task2")); // main 스레드가 수행
        es.submit(new RunnableTask("task3")); // main 스레드가 수행
        es.submit(new RunnableTask("task4")); // thread-1 스레드가 수행

        es.close();
    }
}
