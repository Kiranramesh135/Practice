package com.practice.java;

import java.util.Scanner;

public class ExtractNumbersFromString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		String num;
		
		str = sc.nextLine();
		
		num = str.replaceAll("[^0-9]", "");

		System.out.println(num);

		int a = Integer.parseInt(num);
		
		
	}

}
