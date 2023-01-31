package com.demo.code.a2319;
/**
 * 2319 判断矩阵是否是一个 X 矩阵
 * 
 * 如果一个正方形矩阵满足下述 全部 条件，则称之为一个 X 矩阵 ：
 * 矩阵对角线上的所有元素都 不是 0
 * 矩阵中所有其他元素都是 0
 * 给你一个大小为 n x n 的二维整数数组 grid ，表示一个正方形矩阵。如果 grid 是一个 X 矩阵 ，返回 true ；否则，返回 false 。
 */

public class Solution {
    public boolean checkXMatrix(int[][] grid) {
        return checkXMatrix1(grid);
    }

    // 模拟
    public boolean checkXMatrix1(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i == j || i == grid.length - 1 - j) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}