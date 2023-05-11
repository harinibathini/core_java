package collection.queuepractice;

import java.util.ArrayDeque;

public class ArrayDequePractice {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(1);
        adq.add(3);
        adq.add(13);
        adq.offerFirst(23);
        adq.offerLast(33);
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.peek());
        System.out.println( adq.getLast());
        System.out.println(adq.getFirst());

        System.out.println(adq);
    }
}
