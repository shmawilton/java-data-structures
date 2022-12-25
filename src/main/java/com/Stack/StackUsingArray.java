package com.Stack;

import java.util.Arrays;

public class StackUsingArray {
    private int[] items;
    //implementing two stacks in one array
    private final int[][] twoStackItems = new int[2][5];
    private int counter1;
    private int counter2;
    private int counter;

    public StackUsingArray() {
        items = new int[2];
    }

    public void push(int item) {
        if (items.length == counter) {
            int[] newItems = new int[counter * 2];

            for (int i = 0; i < counter; i++)
                newItems[i] = items[i];

            this.items = newItems;
        }
        items[counter++] = item;
    }


    public int pop() {
        if (counter == 0)
            throw new IllegalArgumentException();
        return items[--counter];
    }

    public int peek() {
        if (counter == 0)
            throw new IllegalArgumentException();
        return items[counter - 1];
    }
    public boolean empty() {
        return counter == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0 , counter);
        return Arrays.toString(content);
    }


    //methods for two stack in one array
    public void push1(int item) {
        if (twoStackItems[0].length == counter1)
            throw new StackOverflowError();

        twoStackItems[0][counter1++] = item;
    }

    public void push2(int item) {
        if (twoStackItems[1].length == counter2)
            throw new StackOverflowError();

        twoStackItems[1][counter2++] = item;
    }

    public int pop1() {
        if (counter1 == 0)
            throw new IllegalArgumentException();
        return twoStackItems[0][--counter1];
    }

    public int pop2() {
        if (counter2 == 0)
            throw new IllegalArgumentException();
        return twoStackItems[1][--counter2];
    }

    public int peek1() {
        if (counter1 == 0)
            throw new IllegalArgumentException();
        return twoStackItems[0][counter1 - 1];
    }

    public int peek2() {
        if (counter2 == 0)
            throw new IllegalArgumentException();
        return twoStackItems[1][counter2 - 1];
    }

    public boolean empty1() {
        return counter1 == 0;
    }
    public boolean empty2() {
        return counter2 == 0;
    }

}

