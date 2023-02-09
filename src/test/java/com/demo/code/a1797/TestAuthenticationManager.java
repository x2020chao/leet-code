package com.demo.code.a1797;

import java.util.Arrays;

public class TestAuthenticationManager {
    public static void main(String[] args) {
        System.out.println(
                Arrays.equals(
                        helperAuthenticationManager(
                                new String[] { "AuthenticationManager", "renew", "generate", "countUnexpiredTokens",
                                        "generate", "renew", "renew", "countUnexpiredTokens" },
                                new Object[][] { { 5 }, { "aaa", 1 }, { "aaa", 2 }, { 6 }, { "bbb", 7 }, { "aaa", 8 },
                                        { "bbb", 10 }, { 15 } }),
                        new Integer[] { null, null, null, 1, null, null, null, 0 }));

        System.out.println(
                Arrays.equals(
                        helperAuthenticationManager(
                                new String[] { "AuthenticationManager", "countUnexpiredTokens", "generate", "generate",
                                        "generate", "renew", "countUnexpiredTokens", "generate", "countUnexpiredTokens",
                                        "generate", "renew", "countUnexpiredTokens", "renew", "renew",
                                        "countUnexpiredTokens", "countUnexpiredTokens", "countUnexpiredTokens",
                                        "countUnexpiredTokens", "renew" },
                                new Object[][] { { 3 }, { 1 }, { "mqjfa", 2 }, { "xg", 5 }, { "dvm", 8 },
                                        { "euxli", 9 }, { 11 }, { "oin", 13 }, { 18 }, { "qst", 19 }, { "qy", 20 },
                                        { 21 }, { "f", 22 }, { "eqe", 23 }, { 25 }, { 26 }, { 27 }, { 28 },
                                        { "oin", 29 } }),
                        new Integer[] { null, 0, null, null, null, null, 0, null, 0, null, null, 1, null, null, 0, 0, 0,
                                0, null }));

    }

    private static Integer[] helperAuthenticationManager(String[] operate, Object[][] data) {
        AuthenticationManager authenticationManager = null;
        Integer[] res = new Integer[operate.length];
        for (int i = 0; i < operate.length; ++i) {
            res[i] = null;
            if ("AuthenticationManager".equals(operate[i])) {
                authenticationManager = new AuthenticationManager((Integer) data[i][0]);
                continue;
            }
            if ("renew".equals(operate[i])) {
                authenticationManager.renew((String) data[i][0], (Integer) data[i][1]);
                continue;
            }
            if ("generate".equals(operate[i])) {
                authenticationManager.generate((String) data[i][0], (Integer) data[i][1]);
                continue;
            }
            res[i] = authenticationManager.countUnexpiredTokens((Integer) data[i][0]);
        }
        return res;
    }
}
