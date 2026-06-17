package com.practice.java.newquestions;

import java.util.Stack;

public class BracketValidatorUsingStack
{



    public static void main(String[] args) {
//        String input1 = "{()}";
        String input2 = "{(([])[])[]}";

//        System.out.println("input1 "+ (isBalanced(input1)? "Balanced":"Not Balanced"));
        System.out.println("input2 "+ (isBalanced(input2)? "Balanced":"Not Balanced"));
    }

    public static Boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for(char i:input.toCharArray()) {
            if(i=='(' || i=='[' || i=='{') {
                stack.push(i);
            }
            else if(i==')' || i==']'|| i=='}') {
                if(stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if(!matches(open,i)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static Boolean matches(char open, char close) {
        return  (open == '(' && close == ')')||
                (open == '[' && close == ']')||
                (open == '{' && close == '}');
    }
}
