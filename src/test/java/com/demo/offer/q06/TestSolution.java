package com.demo.offer.q06;

import static java.lang.System.out;

import java.util.Arrays;

import com.demo.offer.ListNodeUtils;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        out.println(Arrays.equals(solution.reversePrint(ListNodeUtils.generateFromArray(new int[] { 1, 3, 2 })),
                new int[] { 2, 3, 1 }));
    }
}
