package kyh_4_advanced1.thread.control.interrupt;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class ThreadStopMainV3 {
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

            // 인터럽트 상태 != 인터럽트 발생
            // 인터럽트 상태일 때, 인터럽트 예외를 발생시킬 수 있는 코드 실행 시 인터럽트 발생
            while (!thisThread.isInterrupted()) { // 인터럽트 상태 변경 X
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
