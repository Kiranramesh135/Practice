package com.practice.java.newquestions;

public class StringCompression {

    public static void main(String[] args) {
        String s = "aaabbcccc";
        String compression = "";
        int count = 1;

        for(int i=0; i<s.length()-1;i++) {
            if(s.charAt(i)==s.charAt(i+1)) {
                count++;
            }
            else {
                compression = compression+s.charAt(i)+count;
                count = 1;
            }
        }

        compression = compression+s.charAt(s.length()-1)+count;

        System.out.println(compression);
    }
}
