package com.practice.java.newquestions;

import io.cucumber.java.it.Ma;

public class LongestPalindromeSubString {

    public static void main(String[] args) {
        String a = "andndncabcbafkd";
        System.out.println(longestPalindrome(a));
    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        if(s==null||s.length()<1) {
            return "";
        }

        for(int i=0;i<s.length();i++) {
            int len1 = expandAroundCenter(s,i,i); // for odd length palindrome;
            int len2 = expandAroundCenter(s,i,i+1); // for even length palindrome;
            int len = Math.max(len1,len2);

            if(len>end-start) {
                start = i - ((len-1)/2);
                end = i + (len/2);
            }
        }

        return s.substring(start, end+1);

    }

    public static int expandAroundCenter(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }

}
