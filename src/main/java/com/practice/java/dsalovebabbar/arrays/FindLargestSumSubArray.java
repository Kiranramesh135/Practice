package com.practice.java.dsalovebabbar.arrays;

public class FindLargestSumSubArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,-2,6,7};
        int res = a[0];

        for(int i=0;i<a.length;i++) {
            int sum = 0;
            for(int j=i;j<a.length;j++) {
                sum = sum+a[j];
                res = Math.max(res,sum);
            }
        }
        System.out.println(res);
    }
}
