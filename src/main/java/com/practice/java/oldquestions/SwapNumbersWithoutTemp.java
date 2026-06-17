package com.practice.java.oldquestions;

public class SwapNumbersWithoutTemp {
	
	public static void main(String[]args) {
		swapNumbers();
	}
	
	public static void swapNumbers() {
		int a = 10;
		int b = 5;
		
		a = a+b; //a becomes 15
		b = a-b; //b becomes 10
		a = a-b; //a becomes 5 
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);

	}

}
