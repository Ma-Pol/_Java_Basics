package kyh_3_intermediate2.collection.map.ex;

import java.util.HashMap;
import java.util.Map;

// Map을 생성할 때 Map.of()를 사용하면 편리하게 생성할 수 있다.
// Map.of()로 생성한 Map은 불변이다. 따라서 내용을 변경할 수 없다.
public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("A", 1);
//        map1.put("B", 2);
//        map1.put("C", 3);
//
//        Map<String, Integer> map2 = new HashMap<>();
//        map2.put("B", 4);
//        map2.put("C", 5);
//        map2.put("D", 6);

        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println(result);
    }
}
