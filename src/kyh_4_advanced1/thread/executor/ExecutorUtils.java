package kyh_4_advanced1.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static kyh_4_advanced1.util.MyLogger.log;

public abstract class ExecutorUtils {
    public static void printState(ExecutorService executorService) {
        // ExecutorService 인터페이스는 아래와 같이 자세한 메서드를 제공하지 않는다.
        // 이러한 기능은 대표 구현체인 ThreadPoolExecutor에 구현되어 있다.
        // 때문에 아래에선 executorService를 다운캐스팅한 poolExecutor를 사용한다.
        if (executorService instanceof ThreadPoolExecutor poolExecutor) {
            // 스레드 풀에서 관리되는 스레드의 숫자
            int pool = poolExecutor.getPoolSize();
            // 작업을 수행하는 스레드의 숫자
            int active = poolExecutor.getActiveCount();
            // 큐에서 대기중인 작업의 숫자
            int queuedTasks = poolExecutor.getQueue().size();
            // 완료된 작업의 숫자
            long completedTask = poolExecutor.getCompletedTaskCount();

            log("[pool=" + pool + ", active=" + active + ", queuedTasks="
                    + queuedTasks + ", completedTasks=" + completedTask + "]");
        } else {
            log(executorService);
        }
    }

    public static void printState(ExecutorService executorService, String taskName) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) {
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queuedTasks = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();

            log(taskName + " -> [pool=" + pool + ", active=" + active + ", queuedTasks="
                    + queuedTasks + ", completedTasks=" + completedTask + "]");
        } else {
            log(taskName + " -> " + executorService);
        }
    }
}
