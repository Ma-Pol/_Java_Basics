package kyh_3_intermediate2.collection.linked;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);

        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }

        size++;
    }

    // 추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);

        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }

        size++;
    }

    private Node getLastNode() {
        Node x = first;

        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;

        return oldValue;
    }

    // 추가 코드
    public Object remove(int index) {
        Object removedItem;

        if (index == 0) {
            removedItem = first.item;
            first = first.next;
        } else {
            Node prev = getNode(index - 1);
            Node removeNode = prev.next;
            removedItem = removeNode.item;

            prev.next = removeNode.next;
        }

        size--;
        return removedItem;
    }

    public Object get(int index) {
        Node node = getNode(index);

        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;

        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    public int indexOf(Object o) {
        int index = 0;

        // while문 대신 for문으로 작성할 수도 있음
        for (Node x = first; x != null; x = x.next, index++) {
            if (o.equals(x.item)) {
                return index;
            }
        }

        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}