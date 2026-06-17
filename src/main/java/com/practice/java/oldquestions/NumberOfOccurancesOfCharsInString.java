package com.practice.java.oldquestions;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurancesOfCharsInString {

    public static void main(String[]args) {
        String str = "google";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char i: str.toCharArray()) {
            if(charCount.containsKey(i)) {
                charCount.put(i,charCount.get(i)+1);
            }
            else {
                charCount.put(i,1);
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
