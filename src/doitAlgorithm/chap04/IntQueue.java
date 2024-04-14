package doitAlgorithm.chap04;

// 링 버퍼를 활용한 큐
public class IntQueue {
    private int[] queue;    // 큐 배열
    private int capacity;   // 큐 용량
    private int front;      // 맨 앞 커서
    private int rear;       // 맨 뒤 커서
    private int num;        // 현재 데이터 개수

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public IntQueue(int maxLen) {
        this.num = this.front = this.rear = 0;
        this.capacity = maxLen;
        try {
            this.queue = new int[this.capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueueException {
        if (this.num >= this.capacity)
            throw new OverflowIntQueueException();

        this.queue[this.rear++] = x;    // 큐의 맨 뒤에 데이터 저장 후 맨 뒤 커서 위치 변경
        this.num++;                     // 데이터 개수 증가

        if (this.rear == this.capacity) // 큐의 맨 뒤 커서가 인덱스를 초과하는 것을 방지
            this.rear = 0;

        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if (this.num <= 0)
            throw new EmptyIntQueueException();

        int x = this.queue[this.front++];   // 큐의 맨 앞 데이터 출력 후 맨 앞 커서 위치 변경
        this.num--;                         // 데이터 개수 감소

        if (this.front == this.capacity)    // 큐의 맨 앞 커서가 인덱스를 초과하는 것을 방지
            this.front = 0;

        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if (this.num <= 0)
            throw new EmptyIntQueueException();

        return this.queue[this.front];
    }

    public void clear() {
        this.num = this.front = this.rear = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < this.num; i++) {
            int idx = (i + this.front) % this.capacity; // 나눗셈 연산을 통해 인덱스 초과 없이 배열 전체를 순회

            if (this.queue[idx] == x)
                return idx;
        }

        return -1;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int size() {
        return this.num;
    }

    public boolean isEmpty() {
        return this.num <= 0;
    }

    public boolean isFull() {
        return this.num >= this.capacity;
    }

    public void dump() {
        if (this.num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else {
            for (int i = 0; i < this.num; i++)
                System.out.printf("%d ", this.queue[(i + this.front) % this.capacity]);
            System.out.println();
        }
    }
}
