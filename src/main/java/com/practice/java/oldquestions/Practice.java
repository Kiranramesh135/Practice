package com.practice.java.oldquestions;

import java.util.Stack;

public class Practice {

	public static void main(String[] arags) {
		int n = 18, flag = 0;

		for(int i=2 ; i<n; i++) {
			if(n%i==0) {
				System.out.println("Given number is not a prime number");
				flag = 1;
				break;
			}
		}

		if(flag==0) {
			System.out.println("Given number is a prime number");
		}
	}
}
