package com.demo.code.a1664;

import static java.lang.System.out;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        out.println(solution.waysToMakeFair(new int[]{2, 1, 6, 4}) == 1);
        out.println(solution.waysToMakeFair(new int[]{1, 1, 1}) == 3);
        out.println(solution.waysToMakeFair(new int[]{1, 2, 3}) == 0);
    }
}
