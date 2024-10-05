package kyh_4_advanced1.thread.sync.ex;

import static kyh_4_advanced1.util.MyLogger.log;

public class SyncTest2Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                myCounter.count();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }

    private static class MyCounter {
        public void count() {
            int localValue = 0;

            for (int i = 1; i <= 1000; i++) {
                localValue = localValue + 1;
            }

            log("결과: " + localValue);
        }
    }
}
