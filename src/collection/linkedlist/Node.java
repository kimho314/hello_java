package collection.linkedlist;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = this;
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
