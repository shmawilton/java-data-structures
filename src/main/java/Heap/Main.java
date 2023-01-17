package Heap;

import org.arrays.Array;
import queues.PriorityQueue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        var heap = new Heap();
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        heap.remove();
//        System.out.println("done");

        //sorting elements of an array using a Heap
//        int [] numbers = {5, 3, 10, 1, 4, 2 };
//        var heap = new Heap();
//        for (var number : numbers)
//            heap.insert(number);
//        for (var i = numbers.length - 1; i >= 0; i--)
//            numbers[i] = heap.remove();
//        System.out.println(Arrays.toString(numbers));

        //priority queues using heaps
//        var queue = new PriorityQueue(); //insert O(n), //delete: O(1)
//        queue.add(30);
//        queue.add(20);
//        queue.add(10);
//
//        System.out.println(queue);

        int[] numbers = {5, 3, 8, 4, 1, 2};
        maxHeap.heapify(numbers);
//        System.out.println(Arrays.toString(numbers));
        System.out.println(maxHeap.getKthLargest(numbers, 2));
    }
}
