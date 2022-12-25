package linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    //Add first
    public void AddFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
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

        size++;
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

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }
    //a linked list data structures to add items in the middle of the list


    public void addMiddle(int index ,int item) {
        int nodes = 0;
        var current = first;

        while (current != null) {
            current = current.next;
            nodes++;
        }

        size++;
    }
    //deleteLast
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second =  getPrevious(last);
            last = second;
            if (last != null) {
                last.next = null;
            }
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size() { return size;}
    //contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        int index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        if (isEmpty()) return;
        //20 <- 30 <- 40
        var array = toArray();
        var initial_size = this.size;
        this.size = 0;
        this.first = this.last = null;

        for (int i = initial_size - 1; i >= 0 ;i--) {
            AddLast(array[i]);
        }


//        var previous = first;
//        var current = first.next;
//        while (current != null) {
//            var next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//
//        last = first;
//        last.next = null;
//        first = previous;
    }

    public int getKthNodeFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();

        var primary = first;
        var secondary = first;
        int nodeDifference = 0;

        while (nodeDifference < k - 1) {
            secondary = secondary.next;
            if (secondary == null)
                throw new IllegalArgumentException();
            nodeDifference++;
        }

        while (secondary != last) {
            primary = primary.next;
            secondary = secondary.next;
        }

        return primary.value;
    }

    public void  printMiddle() {
        if (isEmpty()) throw new IllegalStateException();

        var a = first;
        var b  = first;

        while (b != last && b.next != last) {
            a = a.next;
            b = b.next.next;
        }

        if (b == last)
            System.out.println(a.value + "," + a.next.value);
        else
            System.out.println(a.value);

//        var slow = first;
//        var fast = first;
//        int counter = 1;
//
//        for (int i = 0;;i++) {
//            slow = slow.next;
//            for (int j = 0; j < 2; j++) {
//                fast = fast != null ? fast.next : null;
//                counter++;
//            }
//            if (fast == last) break;
//        }
//
//        if (counter % 2 == 0)
//            System.out.println(slow.value + "," + slow.next.value);
//        else
//            System.out.println(slow.value);



    }
}
