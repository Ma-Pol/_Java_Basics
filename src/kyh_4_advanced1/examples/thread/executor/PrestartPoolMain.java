package kyh_4_advanced1.examples.thread.executor;

import java.util.concurrent.*;

import static kyh_4_advanced1.examples.thread.executor.ExecutorUtils.*;

public class PrestartPoolMain {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1000);
        printState(es);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) es;
        poolExecutor.prestartAllCoreThreads();
        printState(es);
    }
}
