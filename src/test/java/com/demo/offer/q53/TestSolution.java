package com.demo.offer.q53;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[] { 5, 7, 7, 8, 8, 10 }, 8) == 2);
        System.out.println(solution.search(new int[] { 5, 7, 7, 8, 8, 10 }, 6) == 0);
    }
}
