package com.practice.java.newquestions;

public class ReverseWordsInASentence {

    public static void main(String[] args) {

        String sentence = "Java Coding Interview";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word:words) {
            StringBuilder reverse = new StringBuilder(word).reverse();
            result.append(reverse).append(" ");
        }

        System.out.println(result.toString());
    }
}
