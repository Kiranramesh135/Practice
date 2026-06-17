package com.practice.java.newquestions;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(withLoop(5));
        System.out.println(withRecursion(5));
    }

    public static int withLoop(int n) {

        int fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact*i;
        }

        return fact;
    }

    public static int withRecursion(int n) {
        if(n==0||n==1) {
            return 1;
        }
        else {
            return n*withRecursion(n-1);
        }

    }
}
