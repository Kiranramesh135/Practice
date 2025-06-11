package com.practice.java.newquestions;

import java.util.ArrayList;

public class EvenOddFinder {

    public static void main(String[] args) {

        int[] n = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i:n) {
            if(i%2==0) {
                even.add(i);
            }
            else {
                odd.add(i);
            }
        }
        System.out.println("Even numbers = "+even);
        System.out.println("Odd numbers = "+odd);
    }
}
