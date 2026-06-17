package com.practice.java.dsalovebabbar.arrays;

import java.util.HashSet;

public class UnionOfArrays {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,};
        int[] b = {6,7,8,9,10};

        HashSet<Integer> set = new HashSet<>();

        for (int c: a) {
            set.add(c);
        }

        for(int c: b) {
            set.add(c);
        }

        Integer[] d = (Integer[]) set.toArray();

        System.out.print(set);
    }
}
