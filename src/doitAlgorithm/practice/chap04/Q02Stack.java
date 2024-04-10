package doitAlgorithm.practice.chap04;

public class Q02Stack<E> {
    private E[] stack;
    private int capacity;
    private int pointer;

    public static class EmptyGenericStackException extends RuntimeException {
        public EmptyGenericStackException() {

        }
    }

    public static class OverflowGenericStackException extends RuntimeException {
        public OverflowGenericStackException() {

        }
    }

    public Q02Stack(int maxLen) {
        this.pointer = 0;
        this.capacity = maxLen;
        try {
            this.stack = (E[]) new Object[this.capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public E push(E x) throws OverflowGenericStackException {
        if (this.pointer >= this.capacity)
            throw new OverflowGenericStackException();

        return this.stack[this.pointer++] = x;
    }

    public E pop() throws EmptyGenericStackException {
        if (this.pointer <= 0)
            throw new EmptyGenericStackException();

        return this.stack[--this.pointer];
    }

    public E peek() throws EmptyGenericStackException {
        if (this.pointer <= 0)
            throw new EmptyGenericStackException();

        return this.stack[this.pointer - 1];
    }

    public void clear() {
        this.pointer = 0;
    }

    public int indexOf(E x) {
        for (int i = this.pointer - 1; i >= 0; i--)
            if (this.stack[i].equals(x))
                return i;

        return -1;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int size() {
        return this.pointer;
    }

    public boolean isEmpty() {
        return this.pointer <= 0;
    }

    public boolean isFull() {
        return this.pointer >= this.capacity;
    }

    public void dump() {
        if (this.pointer <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < this.pointer; i++)
                System.out.print(this.stack[i] + " ");
            System.out.println();
        }
    }
}