package com.demo.code.a1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        return twoSum1(nums, target);
    }

    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; ++i) {
            int another = target - nums[i];
            for (int j = i + 1; j < nums.length; ++j) {
                if (another == nums[j]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
