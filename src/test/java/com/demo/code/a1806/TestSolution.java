package com.demo.code.a1806;

import static java.lang.System.out;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        out.println(solution.reinitializePermutation(2) == 1);
        out.println(solution.reinitializePermutation(4) == 2);
        out.println(solution.reinitializePermutation(6) == 4);
    }
}
