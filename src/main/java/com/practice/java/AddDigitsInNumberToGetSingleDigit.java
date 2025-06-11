package com.practice.java;

public class AddDigitsInNumberToGetSingleDigit {

	public static void main(String[] xyz) {
		int a = 1899999988;
		String s = a + "";

		int count = addNums(s);
		System.out.println(count);

		while (count > 9) {
			count = addNums(count + "");

		}

		System.out.println(count);
	}

	public static int addNums(String s) {

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			// System.out.println(s.charAt(i));
			sum = sum + Integer.parseInt(s.charAt(i) + "");
		}

		return sum;

	}

}
