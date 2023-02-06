package com.demo.offer.q35;

import java.util.ArrayList;

import com.demo.offer.Node;

/**
 * 剑指 Offer 35. 复杂链表的复制
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random
 * 指针指向链表中的任意节点或者 null。
 */

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        ArrayList<Node> oriNodes = new ArrayList<>();
        while (cur != null) {
            oriNodes.add(cur);
            cur = cur.next;
        }
        ArrayList<Node> resNodes = new ArrayList<>();
        oriNodes.forEach((item) -> {
            resNodes.add(new Node(item.val));
        });
        for (int i = 0; i < oriNodes.size(); ++i) {
            if (i < oriNodes.size() - 1) {
                resNodes.get(i).next = resNodes.get(i + 1);
            }
            Node temp;
            if ((temp = oriNodes.get(i).random) != null) {
                resNodes.get(i).random = resNodes.get(oriNodes.indexOf(temp));
            }
        }
        return resNodes.get(0);
    }
}
