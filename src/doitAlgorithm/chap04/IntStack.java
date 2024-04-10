package doitAlgorithm.chap04;

// int형 고정 길이 스택
public class IntStack {
    private int[] stack;    // 스택용 배열
    private int capacity;   // 스택 용량
    private int pointer;    // 스택 포인터

    // 실행 시 예외: 스택이 비어 있음
    public static class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {

        }
    }

    // 실행 시 예외: 스택이 가득 참
    public static class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {

        }
    }

    // 생성자
    public IntStack(int maxLen) {
        this.pointer = 0;
        this.capacity = maxLen;
        try {
            this.stack = new int[this.capacity];    // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) {              // 스택 생성 불가능
            this.capacity = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if (this.pointer >= this.capacity)      // 스택이 가득 참
            throw new OverflowIntStackException();

        return this.stack[this.pointer++] = x;
    }

    // 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (this.pointer <= 0)                  // 스택이 비어 있음
            throw new EmptyIntStackException();

        return this.stack[--this.pointer];
    }

    // 스택에서 데이터를 픽(꼭대기에 있는 데이터를 들여다 봄)
    public int peek() throws EmptyIntStackException {
        if (this.pointer <= 0)
            throw new EmptyIntStackException();

        return this.stack[this.pointer - 1];
    }

    // 스택을 모두 비움
    public void clear() {
        this.pointer = 0;
    }

    // 스택에서 x를 찾아 인덱스를 반환(없으면 -1을 반환)
    /*
     * 사견
     *
     * 꼭대기를 시작점으로 해서 먼저 팝되는 위치의 인덱스를 출력한다는 것은 알겠다.
     * 그런데 인덱스의 시작점을 바닥으로 잡는 게 과연 옳은 걸까?
     * 사용자 입장에서는 먼저 팝되는 값의 인덱스가 0으로 시작해서,
     * 가장 나중에 팝되는 값의 인덱스가 pointer인 편이 보기 좋지 않을까?
     * 아니 애초에 스택에서 인덱스 값을 찾아야 할 필요가 있을까?
     */
    public int indexOf(int x) {
        for (int i = this.pointer - 1; i >= 0; i--)
            if (this.stack[i] == x)
                return i;

        return -1;
    }

    // 스택의 용량을 반환
    public int getCapacity() {
        return this.capacity;
    }

    // 스택에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return this.pointer;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {
        return this.pointer <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return this.pointer >= this.capacity;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (this.pointer <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < this.pointer; i++)
                System.out.printf("%d ", this.stack[i]);
            System.out.println();
        }
    }
}
