package com.demo.offer.q09;

public class TestCQueue {
    public static void main(String[] args) {
        CQueue cQueue1 = new CQueue();
        cQueue1.appendTail(3);
        System.out.println(cQueue1.deleteHead() == 3);
        System.out.println(cQueue1.deleteHead() == -1);
        System.out.println(cQueue1.deleteHead() == -1);

        CQueue cQueue2 = new CQueue();
        System.out.println(cQueue2.deleteHead() == -1);
        cQueue2.appendTail(5);
        cQueue2.appendTail(2);
        System.out.println(cQueue2.deleteHead() == 5);
        System.out.println(cQueue2.deleteHead() == 2);
    }
}
