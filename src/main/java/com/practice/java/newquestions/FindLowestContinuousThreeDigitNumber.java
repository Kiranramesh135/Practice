package com.practice.java.newquestions;

public class FindLowestContinuousThreeDigitNumber {

    public static void main(String[] args) {
        int num = 94356784;
        String s = num+"";
        int min = num;

        for(int i=0; i<s.length()-3;i++) {

            int current = Integer.parseInt(s.substring(i,i+3));

            if (current<min) {
                min = current;
            }
        }

        System.out.println(min);


    }
}
