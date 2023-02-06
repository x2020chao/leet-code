package com.demo.offer.q35;

import com.demo.offer.Node;
import com.demo.offer.NodeUtils;
import static java.lang.System.out;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node head1 = NodeUtils
                .generateFromArray(new Integer[][] { { 7, null }, { 13, 0 }, { 11, 4 }, { 10, 2 }, { 1, 0 } });
        out.println(NodeUtils.equals(solution.copyRandomList(head1), head1));
        Node head2 = NodeUtils.generateFromArray(new Integer[][] { { 1, 1 }, { 2, 1 } });
        out.println(NodeUtils.equals(solution.copyRandomList(head2), head2));
        Node head3 = NodeUtils
                .generateFromArray(new Integer[][] { { 3, null }, { 3, 0 }, { 31, null } });
        out.println(NodeUtils.equals(solution.copyRandomList(head3), head3));
    }
}
