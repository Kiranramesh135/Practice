package com.practice.java.newquestions;

public class StringToIntegerConversion {

    public static void main(String[] args) {
//        String to integer
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println("String to Integer = "+i);

//        Integer to String
        int j = 123;
        String b = Integer.toString(j);
        System.out.println("Integer to String = "+b);
    }
}
