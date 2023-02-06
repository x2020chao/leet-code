package com.demo.offer.q03;

public class TestSolution {
    public static void main(String[] args) {
        int res = new Solution().findRepeatNumber(new int[] { 2, 3, 1, 0, 2, 5, 3 });
        System.out.println(res == 2 || res == 3);
    }
}
