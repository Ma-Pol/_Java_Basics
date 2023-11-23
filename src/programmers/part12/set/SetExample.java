package programmers.part12.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("Kang");
        boolean flag2 = set1.add("Kim");
        boolean flag3 = set1.add("Kang");

        System.out.println("set1.size(): " + set1.size());
        System.out.println("flag1: " + flag1);
        System.out.println("flag2: " + flag2);
        System.out.println("flag3: " + flag3);
        System.out.println();

        Iterator<String> iter = set1.iterator();

        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }

        System.out.println();

        for (String str : set1) {
            System.out.println(str);
        }
    }
}
