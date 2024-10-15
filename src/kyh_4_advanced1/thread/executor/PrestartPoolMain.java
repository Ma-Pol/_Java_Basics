package kyh_4_advanced1.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static kyh_4_advanced1.thread.executor.ExecutorUtils.printState;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

// 스레드 미리 생성하기(pre-start)
public class PrestartPoolMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1000);

        printState(es);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) es;
        poolExecutor.prestartAllCoreThreads(); // 이 메서드는 ExecutorService는 제공하지 않는다.
        sleep(100);
        printState(es);

        es.close();
    }
}
