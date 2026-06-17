package com.practice.java.newquestions;

import java.util.HashMap;

public class CountCharacterOccurance {

    public static void main(String[] args) {
        String s = "automation";
        HashMap<Character,Integer> charCount = new HashMap<>();

        for(char ch:s.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch,charCount.get(ch)+1);
            }
            else {
                charCount.put(ch,1);
            }
        }

        System.out.println(charCount);

        for(char c:charCount.keySet()) {
            System.out.println(c+" "+charCount.get(c));
        }


    }
}
