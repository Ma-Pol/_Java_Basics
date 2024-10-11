package kyh_4_advanced1.thread.control.yield;

public class YieldMain {
    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable(), String.format("%3d", i));
            thread.start();
        }
    }

    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);

                // 1. empty
//                kyh_4_advanced1.util.ThreadUtils.sleep(1); // 2. sleep
//                Thread.yield(); // 3. yield
            }
        }
    }
}