package com.practice.java.newquestions;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String s1 = "Silent";
        String s2 = "Listen";
        System.out.println("Are anagrams : "+ areAnagrams(s1, s2));
    }

    public static Boolean areAnagrams(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] chAr1 = s1.toCharArray();
        char[] chAr2 = s2.toCharArray();

        if(chAr1.length != chAr2.length) {
            return false;
        }
        Arrays.sort(chAr1);
        Arrays.sort(chAr2);

        return Arrays.equals(chAr1, chAr2);

    }
}
