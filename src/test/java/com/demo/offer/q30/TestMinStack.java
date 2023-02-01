package com.demo.offer.q30;

public class TestMinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min() == -3);
        minStack.pop();
        System.out.println(minStack.top() == 0);
        System.out.println(minStack.min() == -2);
    }
}
