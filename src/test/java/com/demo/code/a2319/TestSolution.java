package com.demo.code.a2319;

import static java.lang.System.out;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        out.println(solution
                .checkXMatrix(new int[][] { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 0, 0, 2 } }) == true);
        out.println(solution.checkXMatrix(new int[][] { { 5, 7, 0 }, { 0, 3, 1 }, { 0, 5, 0 } }) == false);
    }
}
