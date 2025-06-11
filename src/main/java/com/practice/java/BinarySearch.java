package com.practice.java;

// Binary Search: Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval
// covering the whole array. If the value of the search key is less than the item in the middle of the interval,
// narrow the interval to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value
// is found or the interval is empty.

public class BinarySearch {

    public static void binarySearch(int[] a, int first, int last, int key) {
        int mid = (first+last)/2;

        while(first<=last) {
            if(a[mid]<key) {
                first = mid+1;
            }
            else if(a[mid]==key) {
                System.out.println("Element is found at index "+mid);
                break;
            }
            else {
                last = mid-1;
            }

            mid = (first+last)/2;
        }

        if(first>last) {
            System.out.println("Element not found in array");
        }

    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int last  = arr.length-1;

        binarySearch(arr,0,last,50);
    }
}
