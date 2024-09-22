package kyh_3_intermediate2.collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
        /*
         * TreeSet의 정렬 기준
         * 기본 데이터는 크다, 작다의 기준이 명확하다.
         * 하지만 직접 만든 객체는 대소의 기준이 따로 정해져 있지 않다.
         * 이때, 대소의 기준을 제공하려면 Comparable, Comparator 인터페이스를
         * 구현해야 한다.
         */
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
