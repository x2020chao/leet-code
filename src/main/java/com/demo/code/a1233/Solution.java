package com.demo.code.a1233;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1233. 删除子文件夹
 * 你是一位系统管理员，手里有一份文件夹列表 folder，你的任务是要删除该列表中的所有 子文件夹，并以 任意顺序 返回剩下的文件夹。
 * 
 * 如果文件夹 folder[i] 位于另一个文件夹 folder[j] 下，那么 folder[i] 就是 folder[j] 的 子文件夹 。
 * 
 * 文件夹的「路径」是由一个或多个按以下格式串联形成的字符串：'/' 后跟一个或者多个小写英文字母。
 * 
 * 例如，"/leetcode" 和 "/leetcode/problems" 都是有效的路径，而空字符串和 "/" 不是。
 */

public class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> list = new ArrayList<>();
        String pre = "/";
        for (String folderName : folder) {
            if (folderName.length() > pre.length() && folderName.startsWith(pre)
                    && folderName.charAt(pre.length()) == '/') {
                continue;
            }
            list.add(folderName);
            pre = folderName;
        }
        return list;
    }
}
