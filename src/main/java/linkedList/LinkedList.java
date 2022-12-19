package linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    //Add first
    public void AddFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    // Add Last
    public void AddLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
}

    //deleteFirst
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }
    //a linked list data structures to add items in the middle of the list


    public void addMiddle() {
        int nodes = 0;
        var current = first;

        while (current != null) {
            current = current.next;
            nodes++;
        }
    }
    //deleteLast
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        var second =  getPrevious(last);
        last = second;
        last.next = null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    //contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
