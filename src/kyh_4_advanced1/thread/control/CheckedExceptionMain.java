package kyh_4_advanced1.thread.control;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    private static class CheckedRunnable implements Runnable {
        /*
         * Runnable 인터페이스의 run() 메서드는 체크 예외를 던지지 않게 설계되었다.
         * 자바에서는 부모 메서드가 체크 예외를 던지지 않는 경우,
         * 재정의된 자식 메서드도 체크 예외를 던질 수 없다.
         * 따라서 Runnable 인터페이스의 run() 메서드를 구현할 때, 체크 예외를 던질 수 없다.
         */
        @Override
        public void run() /*throws Exception*/ { // 주석 풀면 예외 발생
            /*throw new Exception();*/ // 주석 풀면 예외 발생
        }
    }
}
