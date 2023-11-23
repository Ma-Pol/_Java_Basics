package programmers.part12.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kim");
        list.add("Kang");
        list.add("Kim");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for (String str : list) {
            System.out.println(str);
        }
    }
}
