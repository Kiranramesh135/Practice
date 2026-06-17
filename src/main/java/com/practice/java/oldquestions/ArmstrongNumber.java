package com.practice.java.oldquestions;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int n = 371;
		int ori = n;
//		String s = "" + n;
		int sum = 0;

		//Using strings
//		for (int i = 0; i < s.length(); i++) {
//			int p = Integer.parseInt("" + s.charAt(i));
//			int q = findCube(p);
//			sum = sum + q;
//
//		}
		
		while(n>0) {
			int p = n%10;
			int q = findCube(p);
			sum = sum + q;
			n = n/10;
		}
		
		System.out.println(sum);

		if (ori == sum) {
			System.out.println("Given number is an armstrong number");
		}
		else {
			System.out.println("Given number is not an armstrong number");
		}
	}

	public static int findCube(int i) {
		return i * i * i;
	}

}
