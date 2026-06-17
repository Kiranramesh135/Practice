package com.practice.java.newquestions;

import java.util.Stack;

public class BracketSwapsUsingStack {


    /*Get a sequence of parantheses, determine the minimum number
    of swaps needed to make the sequence balanced. Each opening bracket
    must have a corresponding closing bracket. Swapping adjacent characters
    is not required. If it is impossible to balance the string, return -1.
    Example brackets = ")()(())(" */


    public static void main(String[] args) {
        String brackets = ")))()(((";
        int swaps = minSwapsToBalance(brackets);
        System.out.println("Minimum swaps required: " + swaps);
    }

    public static int minSwapsToBalance(String s) {
        int open = 0, close = 0;

        // Check if the number of opening and closing brackets is equal
        for (char ch : s.toCharArray()) {
            if (ch == '(') open++;
            else if (ch == ')') close++;
        }

        if (open != close) return -1;

        Stack<Character> stack = new Stack<>();
        int swaps = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push('(');
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Match found, pop
                } else {
                    swaps++;           // Need to swap to fix this
                }
            }
        }

        System.out.println("Stack Size = "+stack.size());

        return swaps;
    }

}
