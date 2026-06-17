package com.practice.java.newquestions;

public class PassByValueDemo {

    public static void main(String[] args) {
        int a = 10;

        passByValue(a);

        System.out.println(a);


    }

    public static void passByValue(int a) {

        a = 100;

        System.out.println(a);
    }
}
