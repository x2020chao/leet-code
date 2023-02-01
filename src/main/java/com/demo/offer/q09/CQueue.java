package com.demo.offer.q09;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * 用两个栈实现一个队列。
 * 
 * 队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 */

public class CQueue {
    private Stack<Integer> pos;
    private Stack<Integer> neg;

    public CQueue() {
        pos = new Stack<>();
        neg = new Stack<>();
    }

    public void appendTail(int value) {
        while (!neg.empty()) {
            pos.push(neg.pop());
        }
        pos.push(value);
    }

    public int deleteHead() {
        while(!pos.empty()) {
            neg.push(pos.pop());
        }
        if (!neg.empty()) {
            return neg.pop();
        }
        return -1;
    }
}