package com.demo.offer;

public class ListNodeUtils {
    public static ListNode generateFromArray(int[] source) {
        ListNode head = null, tail = null;
        for (int item : source) {
            ListNode listNode = new ListNode(item);
            if (head == null) {
                head = listNode;
                tail = listNode;
            } else {
                tail.next = listNode;
                tail = tail.next;
            }
        }
        return head;
    }

    public static boolean equals(ListNode a, ListNode b) {
        if (a == null && b != null) {
            return false;
        } 
        if (a != null && b == null) {
            return false;
        }
        if (a == null && b == null) {
            return true;
        }
        if (a.val != b.val) {
            return false;
        }
        return equals(a.next, b.next);
    }
}
