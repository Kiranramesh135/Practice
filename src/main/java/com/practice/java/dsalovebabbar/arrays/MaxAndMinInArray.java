package com.practice.java.dsalovebabbar.arrays;

public class MaxAndMinInArray {

    public static void main(String[] args) {
        int[] a = {2,3,4,1,6,5};

        System.out.println("max value = "+findMax(a));
        System.out.println("min value = "+findMin(a));

    }

    public static int findMax(int[] a) {
        int max = a[0];
        for(int b: a) {
            if(b>max) {
                max = b;
            }
        }
        return max;
    }

    public static int findMin(int[] a) {
        int min = a[0];
        for(int b: a) {
            if(b<min) {
                min = b;
            }
        }

        return min;
    }
}
