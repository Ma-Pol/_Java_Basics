package kyh_4_advanced1.thread.volatile1;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        t.start();

        sleep(1000);

        task.flag = false;
        log("flag = " + task.flag + ", count = " + task.count + " in main()");

    }

    private static class MyTask implements Runnable {
//        boolean flag = true;
//        long count;
        volatile boolean flag = true;
        volatile long count;

        @Override
        public void run() {
            while (flag) {
                count++;
                // 1억 번에 한 번씩 출력
                if (count % 100_000_000 == 0) {
                    // 주석 처리 한다면...
                    log("flag = " + flag + ", count = " + count + " in while()");
                }
            }

            log("flag = " + flag + ", count = " + count + " 종료");
        }
    }
}
