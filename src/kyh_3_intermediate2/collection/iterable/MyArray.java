package kyh_3_intermediate2.collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {
    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        // 이 자료구조에 사용할 반복자를 반환한다.
        return new MyArrayIterator(numbers);
    }

/*
    익명클래스로 반환
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int currentIndex = -1;

            @Override
            public boolean hasNext() {
                return currentIndex < numbers.length - 1;
            }

            @Override
            public Integer next() {
                return numbers[++currentIndex];
            }
        };
    }
*/
}
