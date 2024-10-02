package kyh_4_advanced1.thread.start;

import static kyh_4_advanced1.util.MyLogger.log;

public class ManyThreadMainV2 {
    public static void main(String[] args) {
        log("mani() start");

        HelloRunnable runnable = new HelloRunnable();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        log("main() end");
    }
}
