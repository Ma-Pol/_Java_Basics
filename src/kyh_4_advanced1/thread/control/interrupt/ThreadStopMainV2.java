package kyh_4_advanced1.thread.control.interrupt;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시: thread.interrupt()");
        thread.interrupt(); // 강제로 InterruptedException 예외 발생
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());

        // Thread.sleep() 처럼 InterruptedException을 던지는 메서드를 호출하거나
        // 또는 호출하며 대기중일 때만 예외가 발생한다.
    }

    private static class MyTask implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    log("작업 중");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                Thread thisThread = Thread.currentThread();

                log("work 스레드 인터럽트 상태2 = " + thisThread.isInterrupted());
                log("interrupt message = " + e.getMessage());
                log("state = " + thisThread.getState());
            }

            log("자원 정리");
            log("작업 종료");
        }
    }
}
