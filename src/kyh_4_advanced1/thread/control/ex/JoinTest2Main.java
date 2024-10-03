package kyh_4_advanced1.thread.control.ex;

import static kyh_4_advanced1.util.MyLogger.log;
import static kyh_4_advanced1.util.ThreadUtils.sleep;

public class JoinTest2Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t2");
        Thread t3 = new Thread(new MyTask(), "t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join(); // t1의 실행이 종료될 때까지 대기
        t2.join(); // t2의 실행이 종료될 때까지 대기
        t3.join(); // t3의 실행이 종료될 때까지 대기

        System.out.println("모든 스레드 실행 종료");
    }

    private static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
}
