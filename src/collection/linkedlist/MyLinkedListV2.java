package collection.linkedlist;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object o) {
        Node newNode = new Node(o);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
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

    public void add(int index, Object o) {
        Node newNode = new Node(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node o = getNode(index);
        Object oldValue = o.item;
        o.item = element;
        return oldValue;
    }

    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prevNode = getNode(index - 1);
            prevNode.next = removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
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
        for (Node x = first; x != null; x = x.next) {
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
}
