package com.practice.java;

public class FindTheMissingNumberInAnArray {

    public static void main (String[] args) {


        int[] a = {1,2,3,4,6,7};

        int count = 1;

        int temp = 0;

        for(int i=0;i<a.length;i++) {
            if(a[i]!=count) {
                temp = count;
                break;
            }
            count++;
        }

        System.out.println("The missing number is "+temp);

    }
}
