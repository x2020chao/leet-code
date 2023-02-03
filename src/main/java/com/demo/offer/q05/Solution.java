package com.demo.offer.q05;

/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */

public class Solution {
    public String replaceSpace(String s) {
        if (s == null) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                stringBuilder.append("%20");
                continue;
            }
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
