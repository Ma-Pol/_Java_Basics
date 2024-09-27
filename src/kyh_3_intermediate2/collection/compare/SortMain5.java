package kyh_3_intermediate2.collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 10);
        MyUser myUser3 = new MyUser("c", 20);

        // TreeSet을 생성할 때 별도의 비교자를 제공하지 않으면
        // 객체가 구현한 Comparable을 사용해 정렬한다.
        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        // TreeSet을 생성할 때 별도의 비교자를 제공하면
        // Comparable 대신 비교자(Comparator)를 사용해 정렬한다.
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("\nIdComparator 정렬");
        System.out.println(treeSet2);
    }
}
