package com.practice.java.newquestions;

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 123456;
        int sum = 0;

        while(number>0) {
            sum = sum+(number%10);
            number = number/10;
        }

        System.out.println(sum);


    }
}
