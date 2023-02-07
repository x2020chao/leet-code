package com.demo.code.a1604;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1604. 警告一小时内使用相同员工卡大于等于三次的人
 * 力扣公司的员工都使用员工卡来开办公室的门。每当一个员工使用一次他的员工卡，安保系统会记录下员工的名字和使用时间。如果一个员工在一小时时间内使用员工卡的次数大于等于三次，这个系统会自动发布一个
 * 警告 。
 * 
 * 给你字符串数组 keyName 和 keyTime ，其中 [keyName[i], keyTime[i]] 对应一个人的名字和他在 某一天
 * 内使用员工卡的时间。
 * 
 * 使用时间的格式是 24小时制 ，形如 "HH:MM" ，比方说 "23:51" 和 "09:49" 。
 * 
 * 请你返回去重后的收到系统警告的员工名字，将它们按 字典序升序 排序后返回。
 * 
 * 请注意 "10:00" - "11:00" 视为一个小时时间范围内，而 "23:51" - "00:10"
 * 不被视为一小时内，因为系统记录的是某一天内的使用情况。
 */

public class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < keyName.length; ++i) {
            if (map.containsKey(keyName[i])) {
                map.get(keyName[i]).add(keyTime[i]);
                continue;
            }
            List<String> val = new ArrayList<>();
            val.add(keyTime[i]);
            map.put(keyName[i], val);
        }
        List<String> list = new ArrayList<>();
        map.forEach((key, val) -> {
            val.sort((a, b) -> {
                for (int i = 0; i < a.length(); ++i) {
                    int comp = a.charAt(i) - b.charAt(i);
                    if (comp == 0) {
                        continue;
                    }
                    return comp;
                }
                return -1;
            });
            for (int i = 0; i < val.size() - 2; ++i) {
                if (inOneHour(val.get(i), val.get(i + 2))) {
                    list.add(key);
                    break;
                }
            }
        });
        list.sort((a, b) -> {
            for (int i = 0; i < a.length(); ++i) {
                int comp = a.charAt(i) - b.charAt(i);
                if (comp == 0) {
                    continue;
                }
                return comp;
            }
            return -1;
        });
        return list;
    }

    private boolean inOneHour(String a, String b) {
        int aHour = Integer.valueOf(a.substring(0, 2));
        int bHour = Integer.valueOf(b.substring(0, 2));
        if (bHour - aHour > 1) {
            return false;
        }
        if (bHour - aHour < 1) {
            return true;
        }
        int aMin = Integer.valueOf(a.substring(3, 5));
        int bMin = Integer.valueOf(b.substring(3, 5));
        if (bMin - aMin > 0) {
            return false;
        }
        return true;
    }
}
