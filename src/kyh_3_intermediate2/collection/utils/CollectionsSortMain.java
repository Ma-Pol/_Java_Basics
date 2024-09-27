package kyh_3_intermediate2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);
        Collections.sort(list);
        System.out.println("sort list = " + list);
        Collections.reverse(list);
        System.out.println("reverse list = " + list);
        /*
         * max : 정렬 기준으로 최댓값을 찾아서 반환한다.
         * min : 정렬 기준으로 최솟값을 찾아서 반환한다.
         * shuffle : 컬렉션을 랜덤하게 섞는다.
         * sort : 정렬 기준으로 컬렉션을 정렬한다.
         * reverse : 정렬 기준의 반대로 컬렉션을 정렬한다.
         */
    }
}
