package kyh_3_intermediate2.collection.set.ex;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
