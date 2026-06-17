package com.practice.java.newquestions;

public class Fibonacci {

    public static int n1=0,n2=1,n3=0;

    public static void main(String[] args) {
        System.out.print(n1+" "+n2);
        withLoop(10);
    }

    public static void withLoop(int count) {

        for(int i=2;i<count;i++) {
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void withRecursion(int count) {

        if(count>0) {
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            withRecursion(count-1);

        }

    }
}
