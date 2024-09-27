package kyh_3_intermediate2.collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        // 다음 항목이 있는지 검사한다.
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        // 다음 항목을 반환한다.
        return targetArr[++currentIndex];
    }
}
