package com.demo.code.a1;

import static java.lang.System.out;

import java.util.Arrays;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        out.println(Arrays.equals(solution.twoSum(new int[] { 2, 7, 11, 15 }, 9), new int[] { 0, 1 }));
        out.println(Arrays.equals(solution.twoSum(new int[] { 3, 2, 4 }, 6), new int[] { 1, 2 }));
        out.println(Arrays.equals(solution.twoSum(new int[] { 3, 3 }, 6), new int[] { 0, 1 }));
    }
}
