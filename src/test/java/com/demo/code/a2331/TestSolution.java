package com.demo.code.a2331;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution
                .evaluateTree(TreeNodeUtils.generateFromArray(new Integer[] { 2, 1, 3, null, null, 0, 1 })) == true);
        System.out.println(solution
                .evaluateTree(TreeNodeUtils.generateFromArray(new Integer[] { 0 })) == false);
    }
}
