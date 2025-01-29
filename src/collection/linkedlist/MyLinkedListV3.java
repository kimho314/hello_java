package collection.linkedlist;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;

    public void add(E o) {
        Node<E> newNode = new Node<E>(o);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
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

    public void add(int index, E o) {
        Node<E> newNode = new Node<E>(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    public E set(int index, E element) {
        Node<E> o = getNode(index);
        E oldValue = o.item;
        o.item = element;
        return oldValue;
    }

    public Object remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prevNode = getNode(index - 1);
            prevNode.next = removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
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

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
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
            Node<E> cur = this;
            sb.append("[");
            while (cur != null) {
                sb.append(cur.item);
                if (cur.next != null) {
                    sb.append("->");
                }
                cur = cur.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
