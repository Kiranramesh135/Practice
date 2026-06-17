package com.practice.java.newquestions;

import java.util.Arrays;

public class ArrayReversal {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int start = 0;
        int end = array.length-1;

        while(start<end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(array));
    }
}
