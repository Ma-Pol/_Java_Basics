package kyh_4_advanced1.examples.thread.start;

import static kyh_4_advanced1.examples.util.MyLogger.log;

public class ManyThreadMainV2 {

    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
        log("main() end");
    }
}
