package kyh_3_intermediate2.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // 의존관계 주입
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
        // MyArrayList: 약 1200ms
        // MyLinkedList: 약 2ms
    }
}
