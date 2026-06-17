package com.practice.java.newquestions;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class FirstRepeatingCharacter {

//    Remove special characters

    public static void main(String[] args) {
        String s = "I Love Java";
        s = s.replaceAll("\\s","");
        System.out.println(s);
    }
}
