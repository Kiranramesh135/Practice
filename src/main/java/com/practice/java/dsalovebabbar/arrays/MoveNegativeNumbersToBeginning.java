package com.practice.java.dsalovebabbar.arrays;

import java.util.Arrays;

public class MoveNegativeNumbersToBeginning {

    public static void main(String[] args) {
        int[] a = {5,4,-2,-5,8,-9,10,7,-6};

        move(a);
        System.out.print(Arrays.toString(a));
    }

    public static void move(int[] a) {

        for(int i=0;i<a.length;i++) {
            for(int j=1;j<a.length-i;j++) {
                if(a[j-1]>a[j]) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
}
