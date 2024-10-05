package kyh_4_advanced1.thread.sync.ex;

// 이 코드의 실행 결과는 20000이 되어야 한다.
// Counter 클래스 내부만 수정하여 올바른 결과가 출력되도록 만들어라.
public class SyncTest1Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("결과: " + counter.getCount());
    }

    private static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count = count + 1;
        }

        public int getCount() {
            return count;
        }
    }
}
