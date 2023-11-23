package programmers.part12.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "Kim");
        map.put("002", "Lee");
        map.put("003", "Choi");

        map.put("001", "Kang"); // 키가 중복되면 나중에 저장한 값이 저장됨

        System.out.println(map.size());
        System.out.println("001 : " + map.get("001"));
        System.out.println("002 : " + map.get("002"));
        System.out.println("003 : " + map.get("003"));

        System.out.println();

        Set<String> keys = map.keySet();

        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next(); // 키를 얻음
            String value = map.get(key); // 키에 해당하는 값을 얻음

            System.out.println(key + " : " + value); // 키와 값을 출력
        }

        System.out.println();

        for (String key : keys) {
            String value = map.get(key); // 키에 해당하는 값을 얻음

            System.out.println(key + " : " + value); // 키와 값을 출력
        }
    }
}
