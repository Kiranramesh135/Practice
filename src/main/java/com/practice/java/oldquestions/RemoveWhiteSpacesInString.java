package com.practice.java.oldquestions;

public class RemoveWhiteSpacesInString {

    public static void main(String[] args) {
        String a = "tomorrow never dies";
        StringBuffer b = new StringBuffer();
        char[] c = a.toCharArray();

        for(char i: c) {

            if(!Character.isWhitespace(i)) {
                b.append(i);
            }
        }

        System.out.println(b);
    }
}
