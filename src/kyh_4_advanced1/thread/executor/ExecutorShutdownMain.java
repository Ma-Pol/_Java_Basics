package kyh_4_advanced1.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static kyh_4_advanced1.thread.executor.ExecutorUtils.printState;
import static kyh_4_advanced1.util.MyLogger.log;

public class ExecutorShutdownMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new RunnableTask("taskA"));
        es.execute(new RunnableTask("taskB"));
        es.execute(new RunnableTask("taskC"));
        es.execute(new RunnableTask("longTask", 100_000)); // 100초 대기
        printState(es);
        log("== shutdown 시작 == ");
        shutdownAndAwaitTermination(es);
        log("== shutdown 완료 ==");
        printState(es);
    }

    private static void shutdownAndAwaitTermination(ExecutorService es) {
        // 새로운 작업을 받지 않는다.
        // 처리 중이거나, 큐에 이미 대기중인 작업은 처리한다.
        // 이후에 풀의 스레드를 종료한다.
        es.shutdown(); // non-blocking

        try {
            log("서비스 정상 종료 시도");

            // awaitTermination(): 작업 완료를 일정 시간동안 대기한다.
            //                     완료시 true, 미완료시 false 반환
            if (!es.awaitTermination(10, TimeUnit.SECONDS)) { // 10초 대기
                // 정상 종료가 너무 오래 걸리면
                log("서비스 정상 종료 실패 -> 강제 종료 시도");
                es.shutdownNow(); // non-blocking, 인터럽트 발생

                // 작업이 취소될 때까지 대기한다.
                if (!es.awaitTermination(10, TimeUnit.SECONDS)) { // 10초 대기
                    log("서비스가 종료되지 않았습니다.");
                }
            }
        } catch (InterruptedException e) {
            // awaitTermination()으로 대기 중인 현재 스레드가 인터럽트될 수 있다.
            es.shutdownNow();
        }
    }
}
