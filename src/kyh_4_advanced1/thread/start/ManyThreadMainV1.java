package kyh_4_advanced1.thread.start;

import static kyh_4_advanced1.util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) {
        log("mani() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();

        log("main() end");
    }
}