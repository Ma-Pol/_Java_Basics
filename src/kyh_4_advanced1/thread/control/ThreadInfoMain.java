package kyh_4_advanced1.thread.control;

import kyh_4_advanced1.thread.start.HelloRunnable;

import static kyh_4_advanced1.util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() = " + mainThread.threadId());
        log("mainThread.getName() = " + mainThread.getName());
        log("mainThread.getPriority() = " + mainThread.getPriority()); // 1 ~ 10 (기본값 5)
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());

        System.out.println();

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());

        /*
         * 스레드 ID: JVM 내에서 각 스레드에 대해 유일하다.
         *            스레드가 생성될 때 자동 할당되며, 직접 지정할 수 없다.
         *
         * 스레드 이름: 스레드의 이름이다. 이 이름은 ID와 달리 중복될 수 있다.
         *
         * 스레드 우선순위: 1(가장 낮음)에서 10(가장 높음)까지의 값으로 설정할 수 있다.
         *                 기본값은 5이며, setPriority() 메서드로 변경할 수 있다.
         *
         * 스레드 그룹: 기본적으로 모든 스레드는 부모 스레드와 동일한 그룹에 속한다.
         *              여러 스레드를 하나의 그룹으로 묶어서 특정 작업
         *              (예: 일괄 종료, 우선순위 설정 등)을 수행할 수 있다.
         *              (스레드 그룹 기능은 직접적으로 사용할 일이 적다.
         *              ※ 부모 스레드: 새로운 스레드를 생성하는 스레드.
         *
         * 스레드 상태: 스레드의 현재 상태로, 열거형으로 정의되어 있다.
         *              NEW: 스레드가 생성되었으며, 아직 실행되지 않은 상태
         *              RUNNABLE: 실행중이거나, 실행할 준비가 된 상태
         *              BLOCKED: 동기화 락을 기다리는 상태
         *              WAITING: 다른 스레드의 특정 작업이 완료되기를 기다리는 상태
         *              TIMED_WAITING: 일정 시간동안 기다리는 상태
         *              TERMINATED: 모든 실행을 마친 상태
         */
    }
}
