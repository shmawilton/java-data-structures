package linkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.AddFirst(20);
        list.AddLast(50);
        list.AddFirst(60);
        list.AddFirst(70);
        list.AddFirst(30);
        list.removeLast();
        list.removeFirst();
        list.reverse();

        var array = list.toArray();

        System.out.println(Arrays.toString(array));
    }
}
