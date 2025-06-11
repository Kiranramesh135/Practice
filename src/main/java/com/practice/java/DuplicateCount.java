package com.practice.java;

import java.util.HashMap;

public class DuplicateCount {

	public static void main(String[] args) {

		String a = "abcdasdwswabqbhfif";
		char[] s = a.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int j = 0; j < s.length; j++) {

			if (map.containsKey(s[j])) {
				map.put(s[j], map.get(s[j]) + 1);
			}
			else {
				map.put(s[j], 1);
			}
		}

		for (char c : map.keySet()) {
			if (map.get(c) > 1) {
				System.out.println(c + "--->" + map.get(c));
			}
		}

	}
}
