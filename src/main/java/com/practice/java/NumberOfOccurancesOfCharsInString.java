package com.practice.java;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurancesOfCharsInString {

    public static void main(String[]args) {
        String str = "google";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            if(charCount.containsKey(str.charAt(i))) {
                charCount.put(str.charAt(i),charCount.get(str.charAt(i))+1);
            }
            else {
                charCount.put(str.charAt(i),1);
            }
        }

        System.out.println(charCount);

        for(Map.Entry<Character,Integer> entry : charCount.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(value>1) {
                System.out.println( "Number of occurrences of "+ key +" = "+ value);
            }

        }
    }
}
