package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeQueueMain {

    public static void main(String[] args) {
        Queue<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.pop() = " + deque.poll());
        System.out.println("deque.pop() = " + deque.poll());
        System.out.println("deque.pop() = " + deque.poll());
        System.out.println(deque);
    }
}
