package queues;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
    private Queue<Integer> queue;
    private int k;
    private int count;

    public  QueueReverser(Queue<Integer> queue, int k) {
        this.k  = k;
        this.queue = queue;
    }

    public void reverser() {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();



        while (!queue.isEmpty()) {
            for (int i = 0; i < k;i++)
                stack.push(queue.remove());
        }
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
