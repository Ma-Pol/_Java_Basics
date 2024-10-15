package kyh_4_advanced1.thread.executor.poolsize;

import kyh_4_advanced1.thread.executor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static kyh_4_advanced1.thread.executor.ExecutorUtils.printState;
import static kyh_4_advanced1.util.MyLogger.log;

public class PoolSizeMainV2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2); // 아래 선언과 같음
//        ExecutorService es = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
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
