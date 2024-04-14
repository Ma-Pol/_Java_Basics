package doitAlgorithm.practice.chap04;

public class Q06Queue<E> {
    private E[] queue;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public static class EmptyGenericQueueException extends RuntimeException {
        public EmptyGenericQueueException() {
        }
    }

    public static class OverflowGenericQueueException extends RuntimeException {
        public OverflowGenericQueueException() {
        }
    }

    public Q06Queue(int maxLen) {
        this.front = this.rear = this.num = 0;
        this.capacity = maxLen;
        try {
            this.queue = (E[]) new Object[this.capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public E enque(E x) throws OverflowGenericQueueException {
        if (this.num >= this.capacity)
            throw new OverflowGenericQueueException();

        this.queue[this.rear++] = x;
        this.num++;

        if (this.rear == this.capacity)
            this.rear = 0;

        return x;
    }

    public E deque() throws EmptyGenericQueueException {
        if (this.num <= 0)
            throw new EmptyGenericQueueException();

        E x = this.queue[this.front++];
        this.num--;

        if (this.front == this.capacity)
            this.front = 0;

        return x;
    }

    public E peek() throws EmptyGenericQueueException {
        if (this.num <= 0)
            throw new EmptyGenericQueueException();

        return this.queue[this.front];
    }

    public void clear() {
        this.front = this.rear = this.num = 0;
    }

    public int indexOf(E x) {
        for (int i = 0; i < this.capacity; i++) {
            int idx = (i + this.front) % this.capacity;

            if (this.queue[idx].equals(x))
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

    public int search(E x) {
        for (int i = 0; i < this.num; i++)
            if (this.queue[(i + this.front) % this.capacity].equals(x))
                return i + 1;

        return 0;
    }
}
