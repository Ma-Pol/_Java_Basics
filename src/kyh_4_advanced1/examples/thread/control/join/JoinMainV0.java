package kyh_4_advanced1.examples.thread.control.join;

import static kyh_4_advanced1.examples.util.MyLogger.log;
import static kyh_4_advanced1.examples.util.ThreadUtils.sleep;

public class JoinMainV0 {

    public static void main(String[] args) {
        log("Start");
        Thread thread1 = new Thread(new Job(), "kyh_4_advanced1.examples.thread-1");
        Thread thread2 = new Thread(new Job(), "kyh_4_advanced1.examples.thread-2");

        thread1.start();
        thread2.start();
        log("End");
    }

    static class Job implements Runnable {

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            log("작업 완료");
        }
    }
}
