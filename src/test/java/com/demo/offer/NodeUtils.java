package com.demo.offer;

import java.util.HashSet;
import java.util.Set;

public class NodeUtils {
    private static Set<Node> resource = new HashSet<>();

    public static Node generateFromArray(Integer[][] head) {
        Node[] nodes = new Node[head.length];
        for (int i = head.length - 1; i >= 0; --i) {
            nodes[i] = new Node(head[i][0]);
            if (i < head.length - 1) {
                nodes[i].next = nodes[i + 1];
            }
        }
        for (int i = head.length - 1; i >= 0; --i) {
            if (head[i][1] != null) {
                nodes[i].random = nodes[head[i][1]];
            }
        }
        return nodes[0];
    }

    public static boolean equals(Node a, Node b) {
        if (resource.contains(b) && resource.contains(a)) {
            return true;
        }
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
        resource.add(a);
        resource.add(b);
        return equals(a.next, b.next) && equals(a.random, b.random);
    }
}
