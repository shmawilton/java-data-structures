package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.AddFirst(20);
        list.AddFirst(50);
        list.AddFirst(60);
        list.AddFirst(70);
        list.AddFirst(30);
        list.removeLast();
        list.removeFirst();


        System.out.println(list.indexOf(50));
    }
}
