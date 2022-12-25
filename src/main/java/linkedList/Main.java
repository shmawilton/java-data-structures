package linkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.AddLast(20);
        list.AddLast(60);
        list.AddLast(80);
        list.AddLast(30);
        list.AddLast(88);
        list.AddLast(88);
//        list.removeLast();
//        list.removeFirst();
//        list.reverse();

        var array = list.toArray();
        list.printMiddle();

        System.out.println(list.getKthNodeFromTheEnd(5));
    }
}
