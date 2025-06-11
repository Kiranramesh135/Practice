package com.practice.java.newquestions;

public class BracketMinimumInsertionsToMatch {

    public static int minAddToMakeValid(String s) {
        int open = 0, insertions = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    insertions++;
                }
            }
        }

        return insertions + open;
    }

    public static void main(String[] args) {
        String s = "())(";
        System.out.println("Min insertions needed: " + minAddToMakeValid(s));
    }
}
