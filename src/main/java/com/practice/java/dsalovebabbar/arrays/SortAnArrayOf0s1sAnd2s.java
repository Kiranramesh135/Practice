package com.practice.java.dsalovebabbar.arrays;

import java.util.Arrays;

public class SortAnArrayOf0s1sAnd2s {

    public static void main(String[] args) {
        int[] a = {1,2,2,1,0,1,0,2,0,1,2,1,0};

        sort(a);

        System.out.print(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        int a0=0,a1=0,a2=0;

        for(int b: a) {
            if(b==0) {
                a0++;
            }
            else if(b==1) {
                a1++;
            }
            else if(b==2) {
                a2++;
            }
        }

        int indx = 0;

        for(int i=0; i<a0; i++) {
            a[indx++] = 0;
        }
        for(int i=0; i<a1; i++) {
            a[indx++] = 1;
        }
        for(int i=0; i<a2; i++) {
            a[indx++] = 2;
        }
    }
}
