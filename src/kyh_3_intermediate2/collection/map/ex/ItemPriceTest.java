package kyh_3_intermediate2.collection.map.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "사과", 500,
                "바나나", 500,
                "망고", 1000,
                "딸기", 1000
        );

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1000)) {
                list.add(entry.getKey());
            }
        }

        System.out.println(list);
    }
}