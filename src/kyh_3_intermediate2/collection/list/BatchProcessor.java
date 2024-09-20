package kyh_3_intermediate2.collection.list;

public class BatchProcessor {
    private final MyList<Integer> list;

    // 인스턴스 생성 시점에 정확한 의존 관계가 결정된다.
    // => 의존 관계가 외부로부터 주입되는 것과 같다.
    // => 의존관계 주입, 의존성 주입(Dependency Injection, DI)이라 한다.
    // (현 예제의 경우, 생성자 의존관계 주입)
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
