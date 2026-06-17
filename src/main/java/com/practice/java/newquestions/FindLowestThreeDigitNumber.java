package com.practice.java.newquestions;

public class FindLowestThreeDigitNumber {

    public static void main(String[] args) {
        int n = 16756784;

        int first = n;
        int second = n;
        int third = n;

        while(n>0) {

            int digit = n%10;

            if(digit<=first) {
                third = second;
                second = first;
                first = digit;
            }
            else if(digit<=second) {
                third = second;
                second = digit;
            }
            else if(digit<=third) {
                third = digit;
            }

            n = n/10;
        }

        System.out.println(first+""+second+""+third+"");
    }
}
