package com.practice.java.newquestions;

import java.util.Arrays;

public class VowelSwap {

    public static void main(String[] args) {
        String a = "icecream";
        char[] c = a.toCharArray();


        for(int i=0;i<c.length-2;i++) {
            if((c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')&&(c[i+1]=='a'||c[i+1]=='e'||c[i+1]=='i'||c[i+1]=='o'||c[i+1]=='u')) {
                char temp = c[i];
                c[i] = c[i+1];
                c[i+1] = temp;

            }
        }

        System.out.println(Arrays.toString(c));
    }
}
