package com.Stack;

import java.util.Stack;

public class StackReverser {
    public String reverser(String input) {
        if (input == null)
            throw  new IllegalArgumentException();

        Stack<Character> stack = new Stack<> ();

        for (Character ch : input.toCharArray())
            stack.push(ch);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
