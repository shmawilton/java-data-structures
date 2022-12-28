package com.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class StackUsingTwoQueues {
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();

    public void push(int item) {
        queue1.add(item);
    }

//    public int pop() {
//        if (queue2.isEmpty() && queue1.isEmpty())
//            throw new IllegalStateException();
//
//        var lastItem = queue1;
//        if (queue2.isEmpty()) {
//
//        }
//            while (!lastItem.isEmpty()) {
//
//                queue2.add(queue1.peek());
//            }
//
//        return lastItem;
//    }

}
