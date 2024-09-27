package kyh_3_intermediate2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 멀티스레드 동기화
public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list class = " + list.getClass());

        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList class = " + synchronizedList.getClass());
    }
}
