package com.practice.java.oldquestions;

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {

	    if(checkAnagrams()) {
	        System.out.println("Anagrams");
        }
	    else {
	        System.out.println("Not Anagrams");
        }

	}

	public static Boolean checkAnagrams() {
        String first = "abcdef";
        String second = "aecdbf";

        char[] fChars = first.toCharArray();
        char[] sChars = second.toCharArray();

        if(fChars.length!=sChars.length) {
            return false;
        }

        Arrays.sort(fChars);
        Arrays.sort(sChars);

        for(int i=0;i<fChars.length;i++) {
            if(fChars[i]!=sChars[i]) {
                return false;
            }
        }

        return true;
    }

}
