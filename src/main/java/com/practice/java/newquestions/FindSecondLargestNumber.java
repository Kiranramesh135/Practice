package com.practice.java.newquestions;

public class FindSecondLargestNumber {

    public static void main(String[] args) {
        manual();
    }

    public static void usingSorting() {
        int[] a = {1,5,3,2,4,7,2};

        for(int i=0;i<a.length;i++) {
            for(int j=1;j<(a.length-i);j++)
            {
                if(a[j-1]>a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest number = "+a[a.length-2]);
    }

    public static void manual() {
        int[] a = {12,35,1,10,34,9};
        int largest = 0;
        int secondLargest = 0;

        for(int b: a) {
            if(b>largest) {
                secondLargest = largest;
                largest = b;
            }
            else if(b>secondLargest && b!=largest) {
                secondLargest = b;
            }
         }
        System.out.println(secondLargest);
    }
}
