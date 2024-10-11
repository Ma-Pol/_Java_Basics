package kyh_4_advanced1.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CASMainV1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        // compareAndSet(a, b): 현재 값이 a라면 b로 변경하고 true를 반환한다.
        //                      a가 아니라면 변경하지 않고 false를 반환한다.
        boolean result1 = atomicInteger.compareAndSet(0, 1);
        System.out.println("result1 = " + result1 + ", value = " + atomicInteger.get());

        boolean result2 = atomicInteger.compareAndSet(0, 1);
        System.out.println("result2 = " + result2 + ", value = " + atomicInteger.get());
    }
}
