package com.LeetCode.Strings;

//LeetCode Problem number 242 - VALID ANAGRAM

import java.util.Arrays;

public class ValidAnagram {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();
            Arrays.sort(sArr);
            Arrays.sort(tArr);

            return Arrays.equals(sArr, tArr);
        }
    }


