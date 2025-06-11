package com.practice.java;

import org.apache.commons.math3.analysis.function.Sin;

import java.util.Stack;

public class Practice {

	public static void main(String[] args) {
		String input1 = "{()}";
		String input2 = "{()}";

		System.out.println("input1 "+ (isBalanced(input1)? "Balanced":"Not Balanced"));
		System.out.println("input2 "+ (isBalanced(input2)? "Balanced":"Not Balanced"));
	}

	public static Boolean isBalanced(String input) {

		Stack<Character> stack = new Stack<>();

		for(char c:input.toCharArray()) {
			if(c=='('||c=='['||c=='{') {
				stack.push(c);
			}
			else if(c==')'||c==']'||c=='}') {
				if(stack.isEmpty()) {
					return false;
				}

				char open = stack.pop();
				if(!isMatched(open,c))  {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static Boolean isMatched(char open, char close) {
		return (open=='(' && close==')')||
				(open=='[' && close==']')||
				(open=='{' && close=='}');
	}
}
