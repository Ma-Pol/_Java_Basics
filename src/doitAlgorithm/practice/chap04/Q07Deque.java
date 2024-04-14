package doitAlgorithm.practice.chap04;

public class Q07Deque {
    private int[] deque;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public class EmptyDequeException extends RuntimeException {
        public EmptyDequeException() {
        }
    }

    public class OverflowDequeException extends RuntimeException {
        public OverflowDequeException() {
        }
    }

    public Q07Deque(int maxLen) {
        this.front = this.rear = this.num = 0;
        this.capacity = maxLen;
        try {
            this.deque = new int[this.capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public int addFirst(int x) throws OverflowDequeException {
        if (this.num >= this.capacity)
            throw new OverflowDequeException();

        this.front = this.front == 0 ? this.capacity - 1 : this.front - 1;

        this.deque[this.front] = x;
        this.num++;

        return x;
    }

    public int addLast(int x) throws OverflowDequeException {
        if (this.num >= this.capacity)
            throw new OverflowDequeException();

        this.deque[this.rear++] = x;
        this.num++;

        if (this.rear >= this.capacity)
            this.rear = 0;

        return x;
    }

    public int offerFirst() throws EmptyDequeException {
        if (this.num <= 0)
            throw new EmptyDequeException();

        int x = this.deque[this.front++];
        this.num--;

        if (this.front >= this.capacity)
            this.front = 0;

        return x;
    }

    public int offerLast() throws EmptyDequeException {
        if (this.num <= 0)
            throw new EmptyDequeException();

        this.rear = this.rear == 0 ? this.capacity - 1 : this.rear - 1;

        int x = this.deque[this.rear];
        this.num--;

        return x;
    }

    public int peekFirst() throws EmptyDequeException {
        if (this.num <= 0)
            throw new EmptyDequeException();

        return this.deque[this.front];
    }

    public int peekLast() throws EmptyDequeException {
        if (this.num <= 0)
            throw new EmptyDequeException();

        return this.deque[this.rear == 0 ? this.capacity - 1 : this.rear - 1];
    }

    public void clear() {
        this.num = this.front = this.rear = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < this.num; i++) {
            int idx = (i + this.front) % this.capacity;

            if (this.deque[idx] == x)
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
            System.out.println("덱이 비어 있습니다.");
        else {
            for (int i = 0; i < this.num; i++)
                System.out.printf("%d ", this.deque[(i + this.front) % this.capacity]);
            System.out.println();
        }
    }

    public int search(int x) {
        for (int i = 0; i < this.num; i++)
            if (this.deque[(i + this.front) % this.capacity] == x)
                return i + 1;

        return 0;
    }
}
