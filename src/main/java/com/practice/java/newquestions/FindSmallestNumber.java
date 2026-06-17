package com.practice.java.newquestions;

public class FindSmallestNumber {

    public static void main(String[] args) {
       int[] a = {5,4,13,7,11,3,2};
       int min = a[0];

       for(int i=1;i<a.length;i++) {
           if(a[i]<min) {
               min = a[i];
           }
       }
       System.out.println("The smallest number = "+min);
    }
}
