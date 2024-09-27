package kyh_3_intermediate2.collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 10);
        MyUser myUser3 = new MyUser("c", 20);

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("\nComparable 기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // Arrays.sort(): 객체가 가지고 있는 Comparable 인터페이스를 사용해 비교, 정렬

        System.out.println("\nIdComparator 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("\nIdComparator().reversed() 정렬");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));

        System.out.println("\n람다를 사용한 정렬");
        Arrays.sort(array, (o1, o2) -> o1.getAge() > o2.getAge() ? -1 : o1.getAge() == o2.getAge() ? 0 : 1);
        System.out.println(Arrays.toString(array));

    }
}
