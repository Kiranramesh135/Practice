package com.practice.java.newquestions;

import java.util.ArrayList;

public class AlternatePositiveAndNegativeIntegers {

    public static void main(String[] args) {

        int[] input = {1,-2,3,7,8,-9,-4,-5};
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i: input) {
            if(i>=0) {
                positive.add(i);
            }
            else if( i<0) {
                negative.add(i);
            }
        }

        int i=0;
        int j=0;

        while(i<positive.size() && j<negative.size()) {

            result.add(positive.get(i++));
            result.add(negative.get(j++));
        }

        System.out.println(result.toString());
    }
}
