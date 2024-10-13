package kyh_4_advanced1.thread.executor.future;

import kyh_4_advanced1.thread.executor.CallableTask;

import java.util.List;
import java.util.concurrent.*;

import static kyh_4_advanced1.util.MyLogger.log;

public class InvokeAllMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        CallableTask task1 = new CallableTask("task1", 1000);
        CallableTask task2 = new CallableTask("task2", 2000);
        CallableTask task3 = new CallableTask("task3", 3000);
        List<Callable<Integer>> tasks = List.of(task1, task2, task3);
//        List<CallableTask> tasks = List.of(task1, task2, task3);

        List<Future<Integer>> futures = es.invokeAll(tasks); // 블로킹

        for (Future<Integer> future : futures) {
            Integer value = future.get();
            log("value = " + value);
        }

        es.close();
    }
}
