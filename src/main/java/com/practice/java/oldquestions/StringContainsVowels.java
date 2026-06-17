package com.practice.java.oldquestions;

public class StringContainsVowels {

    public static Boolean stringContainsVowels(String s) {
        return s.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        System.out.println(stringContainsVowels("cbr"));
    }
}
