package kyh_4_advanced1.thread.collection.simple;

import kyh_4_advanced1.thread.collection.simple.list.BasicList;
import kyh_4_advanced1.thread.collection.simple.list.SimpleList;

public class SimpleListMainV1 {
    public static void main(String[] args) {
        SimpleList list = new BasicList();

        // 스레드1, 스레드2가 동시에 실행하는 상황을 가정
        list.add("A"); // 스레드1 실행
        list.add("B"); // 스레드2 실행
        System.out.println(list);
    }
}
