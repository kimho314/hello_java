package collection.linkedlist;

public class NodeMain1 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        Node cur = first;
        while (cur != null) {
            System.out.println(cur.item);
            cur = cur.next;
        }
    }
}
