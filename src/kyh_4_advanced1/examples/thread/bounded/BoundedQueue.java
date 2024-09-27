package kyh_4_advanced1.examples.thread.bounded;

public interface BoundedQueue {
    void put(String data);

    String take();
}
