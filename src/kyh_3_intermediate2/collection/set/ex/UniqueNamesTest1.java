package kyh_3_intermediate2.collection.set.ex;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();
        for (Integer integer : inputArr) {
            set.add(integer);
        }

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}