package kyh_4_advanced1.thread.control.interrupt;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class ThreadStopMainV4 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(100);
        log("작업 중단 지시: thread.interrupt()");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());
    }

    private static class MyTask implements Runnable {
        @Override
        public void run() {
            Thread thisThread = Thread.currentThread();

            // Thread.interrupted()
            // 스레드가 인터럽트 상태라면 true 반환 후 해당 스레드의 인터럽트 상태를 false로 변경
            // 스레드가 인터럽트 상태가 아니라면 false 반환
            while (!Thread.interrupted()) { // 인터럽트 상태 변경 O
                log("작업 중");
            }
            log("work 스레드 인터럽트 상태2 = " + thisThread.isInterrupted());

            try {
                log("자원 정리 시도");
                Thread.sleep(1000);
                log("자원 정리 완료");
            } catch (InterruptedException e) {
                log("자원 정리 실패 - 자원 정리 중 인터럽트 발생");
                log("work 스레드 인터럽트 상태3 = " + thisThread.isInterrupted());
            }

            log("작업 종료");
        }
    }
}
