package com.practice.java.newquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PairSumFinder {

    public static void main(String[] args) {
        int[] numbers = {2,4,3,5,6,-2,8,7,1};
        int target = 6;
        List<int[]> pairs = findPairSum(numbers,target);
        for(int[] pair:pairs) {
            System.out.println(pair[0]+" "+pair[1]);
        }
    }

    public static List<int[]> findPairSum(int[] a, int target) {

        List<int[]> pairs = new ArrayList<>();
        HashSet<Integer> visitedNumbers = new HashSet<>();

        for(int num:a) {
            int complement =  target-num;

            if(visitedNumbers.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }

            visitedNumbers.add(num);
        }
        return  pairs;
    }
}
