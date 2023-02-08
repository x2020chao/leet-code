package com.demo.code.a1233;

import java.util.Arrays;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.equals(
                solution.removeSubfolders(new String[] { "/a", "/a/b", "/c/d", "/c/d/e", "/c/f" }).toArray(),
                new String[] { "/a", "/c/d", "/c/f" }));

        System.out.println(Arrays.equals(
                solution.removeSubfolders(new String[] { "/a", "/a/b/c", "/a/b/d" }).toArray(),
                new String[] { "/a" }));

        System.out.println(Arrays.equals(
                solution.removeSubfolders(new String[] { "/a/b/c", "/a/b/ca", "/a/b/d" }).toArray(),
                new String[] { "/a/b/c", "/a/b/ca", "/a/b/d" }));
    }
}
