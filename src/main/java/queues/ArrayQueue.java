package queues;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int front;
    private int rear;
    private int counter;

    public ArrayQueue(int capacity) {
        items = new  int[capacity];
    }

    public void enqueue(int item) {
        if (counter == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length;//circular arrays
        counter++;
    }

    public int deQueue() {
        if (counter == 0)
            throw new IllegalStateException();
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length; //circular arrays
        counter--;
        return item;
    }

    public int peek() {
        return items[front];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean isFull() {
        return counter == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
