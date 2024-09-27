package kyh_3_intermediate2.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

// 편리한 컬렉션 생성
public class OfMain {
    public static void main(String[] args) {
        // 편리한 "불변" 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        // class java.util.ImmutableCollections$ListN => 불변 컬렉션
        System.out.println("list class = " + list.getClass());


//        list.add(4); // UnsupportedOperationException 발생
    }
}
