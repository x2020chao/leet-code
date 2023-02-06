package com.demo.offer.q53;

public class TestSolution2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.missingNumber(new int[] { 0, 1, 3 }) == 2);
        System.out.println(solution.missingNumber(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 9 }) == 8);
        System.out.println(solution.missingNumber(new int[] { 0 }) == 1);
        System.out.println(solution.missingNumber(new int[] { 0, 1 }) == 2);
        System.out.println(solution.missingNumber(new int[] { 0, 1, 2 }) == 3);
    }
}
