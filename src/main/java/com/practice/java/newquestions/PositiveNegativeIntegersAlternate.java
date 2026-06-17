package com.practice.java.newquestions;

import java.util.ArrayList;

public class PositiveNegativeIntegersAlternate {

    public static void main(String[] args) {

        int[] input = {1,3,-9,-7,2,-5,6,-4};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i: input) {
            if(i>=0) {
                positive.add(i);
            }
            else if (i<0) {
                negative.add(i);
            }
        }

        int i=0;
        int j=0;

        ArrayList<Integer> combined = new ArrayList<>();

        while(i<positive.size() && j<negative.size()) {
            combined.add(positive.get(i++));
            combined.add(negative.get(j++));
        }

        System.out.println(combined);
    }
}
