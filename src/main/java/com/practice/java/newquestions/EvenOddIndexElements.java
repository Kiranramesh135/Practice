package com.practice.java.newquestions;

public class EvenOddIndexElements {

    public static void main(String[] args) {
        String[] s = { "Java", "Selenium", "TestNG", "Jenkins", "Maven", "Docker"};

        System.out.println("Even Index elements ");
        for(int i=0;i<s.length;i=i+2) {
            System.out.println(s[i]);
        }

        System.out.println("Odd Index elements ");
        for(int i=1;i<s.length;i=i+2) {
            System.out.println(s[i]);
        }

    }
}
