package com.demo.code.a1806;

import java.util.Arrays;

/**
 * 1806 还原排列的最少操作步数
 * 
 * 给你一个偶数 n​​​​​​ ，已知存在一个长度为 n 的排列 perm ，其中 perm[i] == i​（下标 从 0 开始 计数）。
 * 
 * 一步操作中，你将创建一个新数组 arr ，对于每个 i ：
 * 
 * 如果 i % 2 == 0 ，那么 arr[i] = perm[i / 2]
 * 如果 i % 2 == 1 ，那么 arr[i] = perm[n / 2 + (i - 1) / 2]
 * 然后将 arr​​ 赋值​​给 perm 。
 * 
 * 要想使 perm 回到排列初始值，至少需要执行多少步操作？返回最小的 非零 操作步数。
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-number-of-operations-to-reinitialize-a-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    /**
     * @param n 数组长度（偶数）
     * @return 次数
     */
    public int reinitializePermutation(int n) {
        return reinitializePermutation1(n);
    }

    // 模拟
    public int reinitializePermutation1(int n) {
        int[] perm = new int[n];
        int[] init = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i;
            init[i] = i;
        }
        int count = 0;
        do {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] = perm[i / 2];
                } else {
                    arr[i] = perm[n / 2 + (i - 1) / 2];
                }
            }
            perm = arr;
            ++count;
        } while (!Arrays.equals(init, perm));
        return count;
    }
}