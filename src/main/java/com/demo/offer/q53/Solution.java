package com.demo.offer.q53;

/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的次数。
 */

public class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                ++count;
            }
        }
        return count;
    }
}
