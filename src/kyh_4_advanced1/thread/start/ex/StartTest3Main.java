package kyh_4_advanced1.thread.start.ex;

import static kyh_4_advanced1.util.MyLogger.log;

public class StartTest3Main {
    public static void main(String[] args) {
        Thread counter = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    log("value: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "counter");
        counter.start();
    }
}