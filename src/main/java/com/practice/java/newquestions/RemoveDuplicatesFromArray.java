package com.practice.java.newquestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        Integer[] a = {1,2,3,2,5,1,6,3,7};

        LinkedHashSet<Integer> unique = new LinkedHashSet<>(Arrays.asList(a));
        Integer[] uniqueNumbers = unique.toArray(new Integer[0]);

        System.out.println(Arrays.toString(uniqueNumbers));


    }
}
