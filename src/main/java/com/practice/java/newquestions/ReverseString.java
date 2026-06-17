package com.practice.java.newquestions;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(manual("automation"));
          System.out.println(usingStringBuilder("automation"));
    }

    public static String manual(String s) {

        String reverse = "";
        for(int i=s.length()-1;i>=0;i--) {
            reverse = reverse+s.charAt(i);
        }

        return reverse;
    }

    public static String usingStringBuilder(String s) {

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
