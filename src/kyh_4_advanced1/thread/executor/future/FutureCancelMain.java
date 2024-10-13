package kyh_4_advanced1.thread.executor.future;

import java.util.concurrent.*;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class FutureCancelMain {
    // true: Future를 취소 상태로 변경한다. 이때 작업이 실행중이라면 인터럽트로 작업을 중단시킨다.
    // false: Future를 취소 상태로 변경한다. 이미 실행중인 작업을 중단시키지는 않는다.
    private static boolean mayInterruptIfRunning = true; // 변경
//    private static boolean mayInterruptIfRunning = false; // 변경

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<String> future = es.submit(new MyTask());
        log("Future.state: " + future.state());

        // 일정 시간 후 취소 시도
        sleep(3000);

        // cancel() 호출
        log("future.cancel(" + mayInterruptIfRunning + ") 호출");
        boolean cancelResult1 = future.cancel(mayInterruptIfRunning);
        log("Future.state: " + future.state());
        log("cancel(" + mayInterruptIfRunning + ") result: " + cancelResult1);

        // 결과 확인
        try {
            log("Future result: " + future.get());
        } catch (CancellationException e) { // 런타임 예외
            log("Future는 이미 취소되었습니다.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Executor 종료
        es.close();
    }

    private static class MyTask implements Callable<String> {
        @Override
        public String call() throws Exception {
            try {
                for (int i = 0; i < 10; i++) {
                    log("작업 중: " + i);
                    Thread.sleep(1000); // 1초 동안 sleep
                }
            } catch (InterruptedException e) {
                log("인터럽트 발생");
                return "Interrupted";
            }

            return "Completed";
        }
    }
}
