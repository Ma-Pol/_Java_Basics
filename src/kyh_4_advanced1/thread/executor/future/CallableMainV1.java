package kyh_4_advanced1.thread.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class CallableMainV1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 12라인 코드를 13라인과 같이 간소화 할 수 있다.
//        ExecutorService es = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        ExecutorService es = Executors.newFixedThreadPool(1);

        // submit()을 통해 Callable을 작업으로서 전달할 수 있다.
        // Runnalbe은 execute()로 전달한다.
        Future<Integer> future = es.submit(new MyCallable());
        Integer result = future.get();
        log("result value = " + result);
        es.close();
    }

    private static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Callable 시작");
            sleep(2000);
            int value = new Random().nextInt(10);
            log("create value = " + value);
            log("Callable 완료");
            return value;
        }
    }
}
