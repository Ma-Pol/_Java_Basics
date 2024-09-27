package kyh_4_advanced1.examples.thread.start;

import static kyh_4_advanced1.examples.util.MyLogger.log;

public class InnerRunnableMainV3 {

    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        });
        thread.start();

        log("main() end");
    }

}
