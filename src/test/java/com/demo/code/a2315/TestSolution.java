package com.demo.code.a2315;

import static java.lang.System.out;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        out.println(solution.countAsterisks("l|*e*et|c**o|*de|") == 2);
        out.println(solution.countAsterisks("iamprogrammer") == 0);
        out.println(solution.countAsterisks("yo|uar|e**|b|e***au|tifu|l") == 5);
    }
}
