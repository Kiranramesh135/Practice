package com.practice.java.newquestions;

public class ArmstrongChecker {


    public static void main(String[] args) {
        int number = 371;
        int original = number;

        int digits = String.valueOf(original).length();
        int sum = 0;

        while(number>0) {
            int digit = (number%10);
//            sum =  sum + (int) Math.pow(digit,digits);
            sum = sum+ findPower(digit,digits);
            number = number/10;
        }

        if(sum==original) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an armstrong number");
        }
    }

    public static int findPower(int number, int power) {
        int result = 1;
       for(int i=1;i<=power;i++) {
            result *= number;
       }
        return result;
    }
}
