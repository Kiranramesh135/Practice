package com.practice.java.newquestions;

import java.util.HashMap;

public class MaxOccuranceOfCharacterInString {

    public static void main(String[] args) {
        String input = "Example sentence with repeated characters";
        maxCharOccurance(input);
    }

    public static void maxCharOccurance(String s) {
        s = s.replaceAll(" ","");
        System.out.println(s);
        s = s.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }

        }

        char maxchar = '0';
        int maxcount = 0;

        for(char c :map.keySet()) {
            if(map.get(c)>maxcount) {
                maxchar = c;
                maxcount = map.get(c);
            }

        }

        System.out.print(maxchar+" "+"occurred "+maxcount+" times");
    }
}
