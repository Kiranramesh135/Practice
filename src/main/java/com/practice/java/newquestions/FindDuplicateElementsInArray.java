package com.practice.java.newquestions;

import java.util.*;

public class FindDuplicateElementsInArray {

    public static void main(String[] args) {
        int[] a = {1,7,3,5,4,6,3,2,2,2};
        Set<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for(int i:a) {
            if(!seen.add(i)) {
                duplicates.add(i);
            }
        }
        System.out.println(duplicates);
    }
}
