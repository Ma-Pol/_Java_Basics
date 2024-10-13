package kyh_4_advanced1.thread.executor.future;

import java.util.Random;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {
        MyRunnalbe task = new MyRunnalbe();
        Thread thread = new Thread(task, "Thread-1");
        thread.start();
        thread.join();

        int result = task.value;
        log("result value = " + result);
    }

    private static class MyRunnalbe implements Runnable {
        int value;

        @Override
        public void run() {
            log("Runnable 시작");
            sleep(2000);
            value = new Random().nextInt(10);
            log("create value = " + value);
            log("Runnable 완료");
        }
    }
}
