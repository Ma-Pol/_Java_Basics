package programmers.part16;

public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();

        b.start();

        synchronized (b) {
            try {
                System.out.println("b가 완료될 때까지 기다립니다.");
                b.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Total is : " + b.total);
        }
    }
}
