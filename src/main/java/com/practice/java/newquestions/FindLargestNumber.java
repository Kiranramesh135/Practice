package com.practice.java.newquestions;

public class FindLargestNumber {

    public static void main(String[] args ) {
        int[] a = {5,4,13,7,11,3,2};
        int max = a[0];

        for(int i=1;i<a.length;i++) {
            if(a[i]>max) {
                max = a[i];
            }
        }

        System.out.println("Largest number = "+max);
    }


}
