package kyh_3_intermediate2.collection.linked;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

/*
    // IDE 생성 toString()
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
 */


    // 직접 구현
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node x = this;
        sb.append("[");

        while (x != null) {
            sb.append(x.item);

            if (x.next != null) {
                sb.append(" -> ");
            }

            x = x.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
