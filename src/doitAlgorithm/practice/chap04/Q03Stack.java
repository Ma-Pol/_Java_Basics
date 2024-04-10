package doitAlgorithm.practice.chap04;

public class Q03Stack {
    private int[] stack;
    private int capacity;
    private int aPointer;
    private int bPointer;

    public enum AorB {
        StackA, StackB
    }

    public Q03Stack(int maxLen) {
        this.aPointer = 0;
        this.bPointer = maxLen - 1;
        this.capacity = maxLen;
        try {
            this.stack = new int[this.capacity];
        } catch (OutOfMemoryError e) {
            this.capacity = 0;
        }
    }

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    public int push(AorB ab, int x) throws OverflowIntStackException {
        if (this.aPointer > this.bPointer)
            throw new OverflowIntStackException();

        switch (ab) {
            case StackA:
                this.stack[this.aPointer++] = x;
                break;
            case StackB:
                this.stack[this.bPointer--] = x;
                break;
        }

        return x;
    }

    public int pop(AorB ab) throws EmptyIntStackException {
        int x = 0;

        switch (ab) {
            case StackA:
                if (this.aPointer <= 0)
                    throw new EmptyIntStackException();

                x = this.stack[--this.aPointer];
                break;
            case StackB:
                if (this.bPointer >= this.capacity - 1)
                    throw new EmptyIntStackException();

                x = this.stack[++this.bPointer];
                break;
        }

        return x;
    }

    public int peek(AorB ab) throws EmptyIntStackException {
        int x = 0;

        switch (ab) {
            case StackA:
                if (this.aPointer <= 0)
                    throw new EmptyIntStackException();

                x = this.stack[this.aPointer - 1];
                break;
            case StackB:
                if (this.bPointer >= this.capacity - 1)
                    throw new EmptyIntStackException();

                x = this.stack[this.bPointer + 1];
                break;
        }

        return x;
    }

    public int indexOf(AorB ab, int x) {
        switch (ab) {
            case StackA:
                for (int i = this.aPointer - 1; i >= 0; i--)
                    if (this.stack[i] == x)
                        return i;
            case StackB:
                for (int i = this.bPointer + 1; i < this.capacity; i++)
                    if (this.stack[i] == x)
                        return i;
        }

        return -1;
    }

    public void clear(AorB ab) {
        switch (ab) {
            case StackA:
                this.aPointer = 0;
                break;
            case StackB:
                this.bPointer = this.capacity - 1;
                break;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int size(AorB ab) {
        int size = 0;

        switch (ab) {
            case StackA:
                size = this.aPointer;
                break;
            case StackB:
                size = (this.capacity - 1) - this.bPointer;
                break;
        }

        return size;
    }

    public boolean isEmpty(AorB ab) {
        boolean isEmpty = true;

        switch (ab) {
            case StackA:
                isEmpty = this.aPointer <= 0;
                break;
            case StackB:
                isEmpty = this.bPointer >= this.capacity - 1;
                break;
        }

        return isEmpty;
    }

    public boolean isFull(AorB ab) {
        return this.aPointer > this.bPointer;
    }

    public void dump(AorB ab) {
        switch (ab) {
            case StackA:
                if (this.aPointer <= 0)
                    System.out.println("스택이 비어 있습니다.");
                else {
                    for (int i = 0; i < this.aPointer; i++)
                        System.out.printf("%d ", this.stack[i]);
                    System.out.println();
                }
                break;
            case StackB:
                if (this.bPointer >= this.capacity - 1)
                    System.out.println("스택이 비어 있습니다.");
                else {
                    for (int i = this.capacity - 1; i > this.bPointer; i--)
                        System.out.printf("%d ", this.stack[i]);
                    System.out.println();
                }
                break;
        }
    }
}
