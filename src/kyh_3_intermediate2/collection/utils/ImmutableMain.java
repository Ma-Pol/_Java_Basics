package kyh_3_intermediate2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 불변 컬렉션과 가변 컬렉션 전환
public class ImmutableMain {
    public static void main(String[] args) {
        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        // 가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4); // 예외 발생 x
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList class = " + mutableList.getClass());

        // 불변 리스트
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        // class java.util.Collections$UnmodifiableRandomAccessList
        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());

//        unmodifiableList.add(5); // UnsupportedOperationException 발생
    }
}
