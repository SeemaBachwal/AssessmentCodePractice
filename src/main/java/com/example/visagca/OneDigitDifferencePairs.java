package com.example.visagca;

import java.util.*;

public class OneDigitDifferencePairs {
    public int countPairs(int[] nums) {
        Map<Integer, List<String>> byLen = new HashMap<>();
        for (int n : nums) {
            String s = String.valueOf(n);
            int len = s.length();
            byLen.computeIfAbsent(len, k -> new ArrayList<>()).add(s);
        }
        int count = 0;
        for (List<String> group : byLen.values()) {
            for (int i = 0; i < group.size(); i++) {
                for (int j = i + 1; j < group.size(); j++) {
                    if (differsByOneDigit(group.get(i), group.get(j))) count++;
                }
            }
        }
        return count;
    }

    boolean differsByOneDigit(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
                if (diff > 1) return false;
            }
        }
        return diff == 1;
    }
}
