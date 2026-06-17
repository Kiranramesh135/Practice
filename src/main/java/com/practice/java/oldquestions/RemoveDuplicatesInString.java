package com.practice.java.oldquestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInString {

    public static void main(String[] args) {
//        Remove duplicates from string
        String str = "programming";

        Set<Character> unique = new LinkedHashSet<>();

        for(char c: str.toCharArray()) {
            unique.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for(char c: unique) {
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
