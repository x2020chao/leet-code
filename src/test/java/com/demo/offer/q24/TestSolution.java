package com.demo.offer.q24;

import com.demo.offer.ListNode;
import com.demo.offer.ListNodeUtils;

public class TestSolution {
    public static void main(String[] args) {
        ListNode aListNode = ListNodeUtils.generateFromArray(new int[] { 1, 2, 3, 4, 5 });
        ListNode bListNode = ListNodeUtils.generateFromArray(new int[] { 5, 4, 3, 2, 1 });
        Solution solution = new Solution();
        ListNode reverseAListNode = solution.reverseList(aListNode);
        System.out.println(ListNodeUtils.equals(reverseAListNode, bListNode));
    }
}
