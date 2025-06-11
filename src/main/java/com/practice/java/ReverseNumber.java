package com.practice.java;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int r,rev=0;
		int n = 12345;
		
		while(n>0) {
			r = n % 10;
			rev = (rev * 10) + r;
			n = n/10;
		}
		System.out.println(rev);
	}

}
