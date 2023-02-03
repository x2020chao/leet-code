package com.demo.offer.q58;

import static java.lang.System.out;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        out.println("cdefgab".equals(solution.reverseLeftWords("abcdefg", 2)));
        out.println("umghlrlose".equals(solution.reverseLeftWords("lrloseumgh", 6)));
    }
}
