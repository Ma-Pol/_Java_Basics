package kyh_4_advanced1.thread.collection.java;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        // HashSet의 대안
        Set<Integer> copySet = new CopyOnWriteArraySet<>();
        copySet.add(1);
        copySet.add(2);
        copySet.add(3);
        System.out.println("copySet = " + copySet);

        // TreeSet의 대안
        Set<Integer> skipSet = new ConcurrentSkipListSet<>();
        skipSet.add(3);
        skipSet.add(2);
        skipSet.add(1);
        System.out.println("skipSet = " + skipSet);
    }
}
