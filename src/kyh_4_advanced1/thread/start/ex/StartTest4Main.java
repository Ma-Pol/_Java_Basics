package kyh_4_advanced1.thread.start.ex;

import kyh_4_advanced1.util.MyLogger;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new InfinityLoop("A", 1000), "Thread-A");
        Thread threadB = new Thread(new InfinityLoop("B", 500), "Thread-B");
        threadA.start();
        threadB.start();
    }

    private static class InfinityLoop implements Runnable {
        private final String loopKeyword;
        private final int loopTime;

        public InfinityLoop(String loopKeyword, int loopTime) {
            this.loopKeyword = loopKeyword;
            this.loopTime = loopTime;
        }

        @Override
        public void run() {
            while (true) {
                MyLogger.log(loopKeyword);
                try {
                    Thread.sleep(loopTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
