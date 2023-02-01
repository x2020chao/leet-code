package com.demo.code.a2325;

import java.util.HashMap;
import java.util.Map;

/**
 * 2325 解密消息
 * 给你字符串 key 和 message ，分别表示一个加密密钥和一段加密消息。解密 message 的步骤如下：
 * 
 * 使用 key 中 26 个英文小写字母第一次出现的顺序作为替换表中的字母 顺序 。
 * 将替换表与普通英文字母表对齐，形成对照表。
 * 按照对照表 替换 message 中的每个字母。
 * 空格 ' ' 保持不变。
 * 例如，key = "happy boy"（实际的加密密钥会包含字母表中每个字母 至少一次），据此，可以得到部分对照表（'h' -> 'a'、'a' ->
 * 'b'、'p' -> 'c'、'y' -> 'd'、'b' -> 'e'、'o' -> 'f'）。
 * 返回解密后的消息。
 */

public class Solution {
    public String decodeMessage(String key, String message) {
        return decodeMessage1(key, message);
    }

    // 模拟
    public String decodeMessage1(String key, String message) {
        char[] keys = key.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        char mapVal = 'a';
        for (char mapKey : keys) {
            if (map.containsKey(mapKey) || !Character.isLowerCase(mapKey)) {
                continue;
            }
            map.put(mapKey, mapVal++);
            if (map.size() == 26) {
                break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); ++i) {
            // if (Character.isLowerCase(message.charAt(i))) {
            //     stringBuilder.append(map.get(message.charAt(i)));
            // } else {
            //     stringBuilder.append(message.charAt(i));
            // }
            stringBuilder.append(map.getOrDefault(message.charAt(i), message.charAt(i)));
        }
        return stringBuilder.toString();
    }
}
