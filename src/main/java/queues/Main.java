package queues;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //a queue using a linkedlist
//        LinkedListQueue queue = new LinkedListQueue();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        System.out.println(queue.deQueue());
//        queue.enqueue(30);
//        System.out.println(queue.deQueue());
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.enqueue(60);
//        queue.enqueue(70);
//        queue.enqueue(80);
//        System.out.println(queue.size());
//        System.out.println(queue.peek());


        //priority queue
//        PriorityQueue queue = new PriorityQueue();
//        queue.add(5);
//        queue.add(3);
//        queue.add(7);
//        queue.add(1);
//        queue.add(4);
//        queue.add(2);
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        //queue using two stacks
        StackQueue stackQueue = new StackQueue();

        stackQueue.enque(10);
        stackQueue.enque(20);
        stackQueue.enque(30);
        System.out.println(stackQueue.deQueue());
        stackQueue.enque(40);
        stackQueue.enque(50);
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());


//        //test for array implementation
//        ArrayQueue arrayQueue = new ArrayQueue(5);
//        arrayQueue.enqueue(34);
//        arrayQueue.enqueue(56);
//        arrayQueue.enqueue(89);
//        arrayQueue.deQueue();
//        arrayQueue.deQueue();
//        arrayQueue.enqueue(10);
//        arrayQueue.enqueue(20);
//        arrayQueue.enqueue(30);
//        arrayQueue.enqueue(40);
//        arrayQueue.deQueue();
//
//        System.out.println(arrayQueue);




//        Queue<Integer> queue = new ArrayDeque<> ();
//
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//
//        reverse(queue);
//
//        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
