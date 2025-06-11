package com.practice.java;

import org.testng.annotations.Test;

import java.util.LinkedList;

public class ReverseString {


    public static void main(String[] args) {

        String myName = "selenium123java5";

        char[] chars = myName.toCharArray();


//        String reverseName = "";
//
//        for(int i=myName.length()-1; i>=0; i--) {
//
//            String a = ""+chars[i];
//            reverseName = reverseName + a;
//        }
//
//        System.out.print(reverseName);

//        Character.isDigit()

        LinkedList<Integer> newList = new LinkedList<Integer>();

        for (int i = 0; i < chars.length; i++) {

            if (Character.isDigit(chars[i])) {
                newList.add(Integer.parseInt("" + chars[i]));
            }
        }





        int sum = 0;

        for(Integer i: newList) {
            sum += i;
        }

        System.out.println(sum);
    }

    @Test(enabled = false)
    public void homePage() {

    }
}
