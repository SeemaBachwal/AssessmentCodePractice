package com.example.visagca;

public class PatternStringMatch {
    public int countMatches(String text, String pattern) {
        int m = pattern.length();
        int count = 0;
        for (int i = 0; i + m <= text.length(); i++) {
            if (matches(text, i, pattern)) count++;
        }
        return count;
    }

    private boolean matches(String s, int start, String pattern) {
        for (int i = 0; i < pattern.length(); i++) {
            char c = s.charAt(start + i);
            char p = pattern.charAt(i);
            if (p == '0') {
                if (!isVowel(c)) return false;
            } else if (p == '1') {
                if (isVowel(c)) return false;
            } else {
                return false; // invalid pattern character
            }
        }
        return true;
    }

    private boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                return true;
            default:
                return false;
        }
    }
}
