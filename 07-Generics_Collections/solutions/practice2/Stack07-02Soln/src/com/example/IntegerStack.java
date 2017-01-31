package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<Integer>();

    public void push(Integer element) {
        data.addFirst(element);
    }

    public Integer pop() {
      if(data.isEmpty())
      {
        System.out.print("Stack is empty");

    }
      return data.removeFirst();
    }

    public Integer peek() {
        return data.peekFirst();
    }

    public String toString() {
        return data.toString();
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println("After pushing 5 elements: " + stack);

        int element = stack.pop();
        System.out.println("Popped element = " + element);

        System.out.println("After popping 1 element : " + stack);

        
        int top = stack.peek();
        System.out.println("Peeked element = " + top);
        System.out.println("After peeking 1 element : " + stack);
    }
}
