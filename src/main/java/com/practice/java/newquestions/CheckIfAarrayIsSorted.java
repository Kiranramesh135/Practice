package com.practice.java.newquestions;

public class CheckIfAarrayIsSorted {

    public static void main(String[] args) {

//        int[] array = {1,2,3,4,5,6,7};
        int[] array = {1,2,8,4,5,6,7};
        boolean flag = true;

        for(int i=0;i<array.length-1;i++) {
            if(array[i]>array[i+1]) {
                flag = false;
                break;
            }
        }

        System.out.println("Array is sorted : "+flag);
    }
}
