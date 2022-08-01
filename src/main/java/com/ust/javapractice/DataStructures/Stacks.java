package com.ust.javapractice.DataStructures;

import java.util.Stack;

public class Stacks {

    //LIFO
    //push item on the top, pop item off the top, peel looks at item on top

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
}
