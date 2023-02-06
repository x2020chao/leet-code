package com.demo.code.a2331;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeUtils {
    public static TreeNode generateFromArray(Integer[] arr) {
        int i = 0;
        Queue<TreeNode> list = new LinkedList<>();
        TreeNode hNode = new TreeNode(arr[i++]);
        list.offer(hNode);
        while (!list.isEmpty() && i < arr.length) {
            TreeNode node = list.poll();
            Integer temp;
            if ((temp = arr[i++]) != null) {
                node.left = new TreeNode(temp);
                list.offer(node.left);
            }
            if ((temp = arr[i++]) != null) {
                node.right = new TreeNode(temp);
                list.offer(node.right);
            }
        }
        return hNode;
    }
}
