package com.practice.java.newquestions;

import java.util.HashMap;
import java.util.LinkedList;

public class ThirdHighestOccurringNumber {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(2);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer i: list) {
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        System.out.println(map);

        int max = 0;
        int secondHighest = 0;
        int thirdHighest = 0;
        int key = 0;

        for(Integer a: map.keySet()) {
            int i = map.get(a);
            if(i>max) {
                thirdHighest = secondHighest;
                secondHighest = max;
                max = i;
            }
            else if(i>secondHighest && i!=max) {
                thirdHighest = secondHighest;
                secondHighest = i;
            }
            else if(i>thirdHighest && i!=secondHighest) {
                thirdHighest = i;
            }
        }

        for(Integer k:map.keySet()) {
            if(map.get(k).equals(thirdHighest)) {
                key = k;
            }
        }

        System.out.println(key+" is the third highest occurring number with "+thirdHighest+" occurrences");

    }
}



