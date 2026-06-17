package com.practice.java.oldquestions;

//import sun.lwawt.macosx.CSystemTray;

public class StringPalindrome {

    public static void main(String[] args) {

        String pal = "malayalam";
        char[] c = pal.toCharArray();
        StringBuffer reverse = new StringBuffer();
        for(int i=c.length-1;i>=0;i--) {
            reverse.append(c[i]);
        }

        System.out.println(reverse);

        if(pal.equalsIgnoreCase(reverse.toString())) {
            System.out.println("Given string is a palindrome");
        }
        else {
            System.out.println("Given string is not a palindrome");
        }
    }
}