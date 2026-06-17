package com.practice.java.oldquestions;

public class NumberPalindrome {

	// Palindrome number in java: A palindrome number is a number that is same
	// after reverse. For example 545, 151, 34543, 343, 171, 48984 are the
	// palindrome numbers.

	// Palindrome number algorithm
	//
	// Get the number to check for palindrome
	// Hold the number in temporary variable
	// Reverse the number
	// Compare the temporary number with reversed number
	// If both numbers are same, print "palindrome number"
	// Else print "not palindrome number"
	
	
	public static void main(String[]args) {
		int r,sum=0,temp;
		int n=32423; //It is the number variable to be checked for a palindrome
		
		temp=n; 
		while(n>0) {
		r=n%10; //getting remainder
		sum=(sum*10)+r;
		n=n/10;
		}
		if(temp==sum)
			System.out.println("Palindrome number ");
		else
			System.out.println("Not a Palindrome");
	}

}
