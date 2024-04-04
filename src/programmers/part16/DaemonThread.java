package programmers.part16;

public class DaemonThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("데몬 스레드가 실행중입니다.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonThread());

        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(1999);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("메인 스레드가 종료됩니다!");
    }
}
