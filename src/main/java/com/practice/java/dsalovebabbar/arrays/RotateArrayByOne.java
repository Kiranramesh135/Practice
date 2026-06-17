package com.practice.java.dsalovebabbar.arrays;

import java.util.Arrays;

public class RotateArrayByOne {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        int lastNum = a[a.length-1];

        for(int i=a.length-1;i>0;i--) {
            a[i] = a[i-1];
        }

        a[0] = lastNum;

        System.out.print(Arrays.toString(a));
    }
}
