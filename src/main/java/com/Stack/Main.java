package com.Stack;

public class Main {
    public static void main(String[] args) {

        //implemented stack
        StackUsingArray stack = new StackUsingArray();

        stack.push1(20);
        stack.push1(2);
        stack.push1(34);
        stack.push1(23);
        stack.push2(87);
        stack.push2(24);
        stack.push2(40);

        System.out.println(stack.peek1());
        System.out.println(stack.peek2());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());





//        StackReverser reverse = new StackReverser();
//
//        System.out.println(reverse.reverser("abcdk hjhkjhkres"));
//
//        Expression expr = new Expression();
//        if (expr.braceChecker("{(1} + {(4))}"))
//            System.out.println("The expression is balanced");
//        else
//            System.out.println("The expression is not balanced");
    }
}
