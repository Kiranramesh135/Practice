package com.practice.java.newquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ShuffledPalindrome {

    public static boolean canFormPalindrome(String str) {
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
//                freq.put(c, freq.getOrDefault(c, 0) + 1);
                if(freq.containsKey(c)) {
                    freq.put(c,freq.get(c)+1);
                }
                else {
                    freq.put(c,1);
                }
            }
        }

        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) oddCount++;
        }

        return oddCount <= 1;
    }

    public static String shuffleString(String str) {
        List<Character> characters = new ArrayList<>();
        for (char c : str.toCharArray()) characters.add(c);
        Collections.shuffle(characters);
        StringBuilder shuffled = new StringBuilder();
        for (char c : characters) shuffled.append(c);
        return shuffled.toString();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-z0-9]", "");
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String original = "Cararc";

        original = original.toLowerCase();

        if (!canFormPalindrome(original)) {
            System.out.println(" The string CANNOT be rearranged into a palindrome.");
            return;
        }

        System.out.println("The string can be rearranged into a palindrome.");
        String shuffled = "";
        int attempts = 0;
        int maxAttempts = 1000;

        // Keep shuffling until a palindrome is found or attempts run out
        while (attempts < maxAttempts) {
            shuffled = shuffleString(original);
            if (isPalindrome(shuffled)) {
                System.out.println(" Palindromic Shuffle Found: " + shuffled);
                return;
            }
            attempts++;
        }

        System.out.println(" Could not generate a palindromic shuffle after " + maxAttempts + " attempts.");
    }
}

