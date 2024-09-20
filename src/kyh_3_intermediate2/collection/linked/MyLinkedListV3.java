package kyh_3_intermediate2.collection.linked;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);

        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }

        size++;
    }

    // 추가 코드
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);

        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }

        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;

        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = e;

        return oldValue;
    }

    // 추가 코드
    public E remove(int index) {
        E removedItem;

        if (index == 0) {
            removedItem = first.item;
            first = first.next;
        } else {
            Node<E> prev = getNode(index - 1);
            Node<E> removeNode = prev.next;
            removedItem = removeNode.item;

            prev.next = removeNode.next;
        }

        size--;
        return removedItem;
    }

    public E get(int index) {
        Node<E> node = getNode(index);

        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;

        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    public int indexOf(E e) {
        int index = 0;

        for (Node<E> x = first; x != null; x = x.next, index++) {
            if (e.equals(x.item)) {
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

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> temp = this;

            sb.append("[");
            while (temp != null) {
                sb.append(temp.item);
                if (temp.next != null) {
                    sb.append(" -> ");
                }
                temp = temp.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
}
