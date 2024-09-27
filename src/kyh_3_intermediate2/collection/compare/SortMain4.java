package kyh_3_intermediate2.collection.compare;

import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 10);
        MyUser myUser3 = new MyUser("c", 20);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("\nComparable 기본 정렬");
        list.sort(null); // Java 1.8부터 사용됨
//        Collections.sort(list, null); // 권장하지 않음
        System.out.println(list);

        System.out.println("\nIdComparator 정렬");
        list.sort(new IdComparator()); // Java 1.8부터 사용됨
//        Collections.sort(list, new IdComparator()); // 권장하지 않음
        System.out.println(list);
    }
}
