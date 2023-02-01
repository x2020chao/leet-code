package com.demo.offer.q30;

import java.util.Stack;

/**
 * 剑指 Offer 30 包含min函数的栈
 * 定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */

public class MinStack {
    private Stack<Integer> base, min;

    public MinStack() {
        base = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        base.push(x);
        if (min.empty()) {
            min.push(x);
        } else {
            min.push(Math.min(min.peek(), x));
        }
    }

    public void pop() {
        if (base.empty()) {
            return;
        }
        base.pop();
        min.pop();
    }

    public int top() {
        if (base.empty()) {
            return -1;
        }
        return base.peek();
    }

    public int min() {
        if (min.empty()) {
            return -1;
        }
        return min.peek();
    }
}
