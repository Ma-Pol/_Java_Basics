package kyh_3_intermediate2.collection.deque;

import java.util.Stack;

/*
 * 자바의 Stack 클래스는 내부에서 Vector 라는 자료구조를 사용한다.
 * 이 자료구조는 자바 1.0에 개발되었는데, 지금은 사용되지 않고 있다.
 * 현재는 더 좋은 자료구조가 많으므로 이 Stack 클래스의 사용은 권장하지 않는다.
 * 대신, 이후에 설명할 Deque 클래스를 사용하는 것이 좋다.
 */
public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }
}
