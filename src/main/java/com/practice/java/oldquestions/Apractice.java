package com.practice.java.oldquestions;

import java.util.*;

public class Apractice {

    public static void main(String[] args) {
//  minimum swaps needed
//        String b = "()(((";
        String brackets = ")))()((((";

       System.out.println(""+checkSwaps(brackets));

    }

    public static int checkSwaps(String brackets) {

        int open = 0;
        int close = 0;

        for(char c: brackets.toCharArray()) {
            if(c=='(') {
                open++;
            }
            else if(c==')') {
                close++;
            }
        }

        if (open!=close) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();
        int swaps = 0;

        for(char c: brackets.toCharArray()) {
            if(c=='(') {
                stack.push(c);
            }
            else {
                if(!stack.isEmpty() && stack.peek() =='(') {
                    stack.pop();
                }
                else {
                    swaps++;
                }
            }
        }

        return swaps;
    }
}