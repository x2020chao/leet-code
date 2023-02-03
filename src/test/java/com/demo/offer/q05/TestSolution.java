package com.demo.offer.q05;

import static java.lang.System.out;

public class TestSolution {
    public static void main(String[] args) {
        String s = new String("We are happy.");
        out.println("We%20are%20happy.".equals(new Solution().replaceSpace(s)));
    }
}
