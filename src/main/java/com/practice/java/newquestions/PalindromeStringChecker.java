package com.practice.java.newquestions;

public class PalindromeStringChecker {

    public static void main(String[] args) {

        String original = "malayalam";
        original = original.toLowerCase();
        StringBuilder reverse = new StringBuilder(original);
        reverse.reverse();

        if(original.equalsIgnoreCase(reverse.toString())) {
            System.out.println("Given String is a palindrome");
        }
        else {
            System.out.println("Given String is not a palindrome");
        }
    }
}
