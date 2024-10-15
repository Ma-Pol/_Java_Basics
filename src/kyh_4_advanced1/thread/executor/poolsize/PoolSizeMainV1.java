package kyh_4_advanced1.thread.executor.poolsize;

import kyh_4_advanced1.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static kyh_4_advanced1.thread.executor.ExecutorUtils.printState;
import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class PoolSizeMainV1 {
    public static void main(String[] args) {
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        ExecutorService es = new ThreadPoolExecutor(2, 4, 3000, TimeUnit.MILLISECONDS, workQueue);
        printState(es);

        // 작업 요청, 코어 스레드 1개가 즉시 작업 수행
        es.execute(new RunnableTask("task1"));
        printState(es, "task1");

        // 작업 요청, 코어 스레드 1개가 즉시 작업 수행
        es.execute(new RunnableTask("task2"));
        printState(es, "task2");

        // 작업 요청, 블로킹 큐에 작업 저장
        es.execute(new RunnableTask("task3"));
        printState(es, "task3");

        // 작업 요청, 블로킹 큐에 작업 저장
        es.execute(new RunnableTask("task4"));
        printState(es, "task4");

        // 작업 요청
        // 코어 스레드가 모두 작업 중이며, 블로킹 큐가 가득 찬 상황임을 확인
        // 초과 스레드 1개를 생성해 즉시 작업 수행
        es.execute(new RunnableTask("task5"));
        printState(es, "task5");

        // 작업 요청
        // 코어 스레드가 모두 작업 중이며, 블로킹 큐가 가득 찬 상황임을 확인
        // 초과 스레드 1개를 생성해 즉시 작업 수행
        es.execute(new RunnableTask("task6"));
        printState(es, "task6");

        // 기본 스레드 2개, 최대 스레드 4개, 블로킹 큐에 저장 가능한 태스크 2개
        // -> 최대 6개 동시 수행 가능
        // 최대치의 스레드가 작업 중이며, 블로킹 큐도 가득 찬 상황
        // 작업 실행 거절 예외 발생
        try {
            es.execute(new RunnableTask("task7"));
        } catch (RejectedExecutionException e) {
            log("task7 실행 거절 예외 발생: " + e);
        }

        sleep(3000);
        log("== 작업 수행 완료 ==");
        printState(es);

        // 작업 수행 후, 초과 생성된 2개의 스레드 제거
        sleep(3000);
        log("== maximumPoolSize 대기 시간 초과 ==");
        printState(es);

        es.close();
        log("== shutdown 종료 ==");
        printState(es);
    }
}
