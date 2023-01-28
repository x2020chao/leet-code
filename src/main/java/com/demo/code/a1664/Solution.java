package com.demo.code.a1664;

/**
 * 1664 生成平衡数组的方案数
 * 给你一个整数数组 nums 。你需要选择 恰好 一个下标（下标从 0 开始）并删除对应的元素。请注意剩下元素的下标可能会因为删除操作而发生改变。
 * 
 * 比方说，如果 nums = [6,1,7,4,1] ，那么：
 * 
 * 选择删除下标 1 ，剩下的数组为 nums = [6,7,4,1] 。
 * 选择删除下标 2 ，剩下的数组为 nums = [6,1,4,1] 。
 * 选择删除下标 4 ，剩下的数组为 nums = [6,1,7,4] 。
 * 如果一个数组满足奇数下标元素的和与偶数下标元素的和相等，该数组就是一个 平衡数组 。
 * 
 * 请你返回删除操作后，剩下的数组 nums 是 平衡数组 的 方案数 。
 */

public class Solution {
    public int waysToMakeFair(int[] nums) {
        return waysToMakeFair1(nums);
    }

    // 动态规划
    public int waysToMakeFair1(int[] nums) {
        int preOdd = 0, preEven = 0;
        int sufOdd = 0, sufEven = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i % 2 == 0) {
                sufEven += nums[i];
            } else {
                sufOdd += nums[i];
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i % 2 == 0) {
                sufEven -= nums[i];
            } else {
                sufOdd -= nums[i];
            }
            if (preOdd + sufEven == preEven + sufOdd) {
                ++count;
            }
            if (i % 2 == 0) {
                preEven += nums[i];
            } else {
                preOdd += nums[i];
            }
        }
        return count;
    }
}
