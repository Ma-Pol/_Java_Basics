package kyh_4_advanced1.thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable helloThread = new HelloRunnable();
        Thread thread = new Thread(helloThread); // 인라인 처리 가능
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
