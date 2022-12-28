package queues;

import java.util.NoSuchElementException;

public class LinkedListQueue {
    private static class Node {
        private int value;
        private Node next;

        public Node(int item) {
            value = item;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void enqueue(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int deQueue() {
        if (isEmpty())
            throw new NoSuchElementException();

        var removed = first.value;
        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;

        return removed;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int peek() {
        return first.value;
    }

    public int size() {
        return size;
    }


}
