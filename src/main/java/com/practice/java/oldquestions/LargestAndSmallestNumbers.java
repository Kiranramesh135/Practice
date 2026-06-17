package com.practice.java.oldquestions;

public class LargestAndSmallestNumbers {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i=0; i<arr.length; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
            else if(arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
    }
}
