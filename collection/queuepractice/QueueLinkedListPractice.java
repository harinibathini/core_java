package collection.queuepractice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListPractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.add(48);
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.poll();
      // System.out.println(queue.remove());  NoSuchElementException
        System.out.println(queue.poll());
        System.out.println(queue);
       // System.out.println(queue.element()); NoSuchElementException
        System.out.println(queue.peek());

    }
}
