package kyh_4_advanced1.thread.executor.future;

import java.util.concurrent.*;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class FutureExceptionMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("작업 전달");
        Future<Integer> future = es.submit(new ExCallable());
        sleep(1000);

        try {
            log("future.get() 호출 시도, future.state(): " + future.state());
            Integer result = future.get();
            log("result value = " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) { // future의 상태가 FAILED면 ExecutionException 예외를 던진다.
            log("e = " + e);
            Throwable cause = e.getCause(); // 작업에서 발생한 원본 예외를 받을 수 있다.
            log("cause = " + cause);
        }

        es.close();
    }

    private static class ExCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Callable 실행, 예외 발생");
            throw new IllegalStateException("ex!");
        }
    }
}
