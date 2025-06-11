package com.practice.java.newquestions;

import java.util.Arrays;

public class RemoveDuplicatesFromArrayWithoutUsingCollections {

    public static int removeDuplicates(int[] arr){
        int n = arr.length;

        if(n==0||n==1) {
            return n;
        }

        int[] temp = new int[n];
        int newIndex = 0;

        for (int i=0;i<n;i++) {
            boolean isDuplicate = false;
            for(int j=0;j<newIndex;j++) {
                if(arr[i]==temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                temp[newIndex] = arr[i];
                newIndex++;
            }

        }

        for(int i=0;i<newIndex;i++) {
            arr[i] = temp[i];
        }

        return newIndex;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,9,4,9,8,1,5};

        int newLength = removeDuplicates(arr);

        System.out.print("After removing duplicates : ");

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
