package kyh_4_advanced1.examples.thread.executor.poolsize;

import kyh_4_advanced1.examples.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static kyh_4_advanced1.examples.thread.executor.ExecutorUtils.printState;
import static kyh_4_advanced1.examples.util.MyLogger.log;

public class PoolSizeMainV2 {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        //ExecutorService es = new ThreadPoolExecutor(2, nThreads,
        //        0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 6; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }
        es.close();
        log("== shutdown 완료 ==");

    }
}