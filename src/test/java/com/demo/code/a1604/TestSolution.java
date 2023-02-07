package com.demo.code.a1604;

import java.util.Arrays;

public class TestSolution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                Arrays.equals(
                        solution.alertNames(
                                new String[] { "daniel", "daniel", "daniel", "luis", "luis", "luis", "luis" },
                                new String[] { "10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00" })
                                .toArray(),
                        new String[] { "daniel" }));

        System.out.println(
                Arrays.equals(
                        solution.alertNames(
                                new String[] { "alice", "alice", "alice", "bob", "bob", "bob", "bob" },
                                new String[] { "12:01", "12:00", "18:00", "21:00", "21:20", "21:30", "23:00" })
                                .toArray(),
                        new String[] { "bob" }));

        System.out.println(
                Arrays.equals(
                        solution.alertNames(
                                new String[] { "john", "john", "john" },
                                new String[] { "23:58", "23:59", "00:01" })
                                .toArray(),
                        new String[] {}));

        System.out.println(
                Arrays.equals(
                        solution.alertNames(
                                new String[] { "leslie", "leslie", "leslie", "clare", "clare", "clare", "clare" },
                                new String[] { "13:00", "13:20", "14:00", "18:00", "18:51", "19:30", "19:49" })
                                .toArray(),
                        new String[] { "clare", "leslie" }));
    }
}
