package com.practice.java.newquestions;

import java.util.HashMap;

public class LengthOfLongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                // Move the left pointer to one past the last occurrence
                left = map.get(currentChar) + 1;
            }

            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
    }

}

