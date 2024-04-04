package programmers.part16;

public class JoinExam {
    public static void main(String[] args) {
        MyThread5 thread = new MyThread5();
        
        thread.start();

        System.out.println("시작");

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("종료");
    }
}
