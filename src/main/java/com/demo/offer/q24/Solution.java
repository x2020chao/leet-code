package com.demo.offer.q24;

import com.demo.offer.ListNode;

/**
 * 剑指 Offer 24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode reverseListHead = new ListNode(0);
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = reverseListHead.next;
            reverseListHead.next = current;
            current = next;
        }
        return reverseListHead.next;
    }
}
