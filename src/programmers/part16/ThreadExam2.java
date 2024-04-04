package programmers.part16;

public class ThreadExam2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("*");
        MyThread2 t2 = new MyThread2("-");

        // Thread 상속으로 만든 스레드와의 차이점
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.out.println("main end!!!");
    }
}
