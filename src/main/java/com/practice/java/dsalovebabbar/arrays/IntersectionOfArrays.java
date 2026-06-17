package com.practice.java.dsalovebabbar.arrays;

import java.util.HashSet;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,2,5,7,8,9};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<a.length;i++) {
            for(int j=0;j<b.length;j++) {
                if(a[i]==b[j]) {
                    set.add(a[i]);
                }
            }
        }

        System.out.print(set);
    }
}
