package com.demo.code.a2325;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String key1 = "the quick brown fox jumps over the lazy dog";
        String message1 = "vkbs bs t suepuv";
        System.out.println("this is a secret".equals(solution.decodeMessage(key1, message1)));
        String key2 = "eljuxhpwnyrdgtqkviszcfmabo", message2 = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        System.out.println("the five boxing wizards jump quickly".equals(solution.decodeMessage(key2, message2)));
    }
}
