package kyh_3_intermediate2.collection.deque.ex.queue;

public class CleanTask implements Task {
    @Override
    public void execute() {
        System.out.println("사용되지 않는 자원 정리...");
    }
}
