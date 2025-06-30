package collection;


import java.util.LinkedList;
import java.util.Queue;

public class QueueList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);// return exception
        queue.offer(23); // returns false if problem
//        for (Integer i : queue) {
//            System.out.println(i);
//        }
        utility.print(queue);
//        System.out.println(queue.peek());// return exception if null
//        System.out.println(queue.element()); //returns Null if there is no element
        System.out.println(queue.remove());
        System.out.println(queue.remove());
//        System.out.println(queue.peek());
//        System.out.println(queue.element());
        utility.print(queue);
        System.out.println(queue.remove());
    }


}
