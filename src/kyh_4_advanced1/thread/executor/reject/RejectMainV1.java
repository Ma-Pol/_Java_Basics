package kyh_4_advanced1.thread.executor.reject;

import kyh_4_advanced1.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static kyh_4_advanced1.util.MyLogger.log;

public class RejectMainV1 {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(1, 1,
                0, TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new ThreadPoolExecutor.AbortPolicy()); // Executor 예외 정책(예외를 발생시킴)

        es.submit(new RunnableTask("task1"));

        try {
            es.submit(new RunnableTask("task2"));
        } catch (RejectedExecutionException e) {
            log("요청 초과");
            // 이곳에서 포기, 다시 시도 등 다양한 고민을 하면 된다.
            log(e);
        }

        es.close();
    }
}
