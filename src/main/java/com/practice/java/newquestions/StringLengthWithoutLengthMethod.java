package com.practice.java.newquestions;

public class StringLengthWithoutLengthMethod {

    public static void main(String[] args) {
        String s = "Automations";
        int length = 0;

      try {
          while(true) {
              s.charAt(length);
              length++;
          }
      }
      catch (StringIndexOutOfBoundsException e) {
          System.out.println(e.getMessage());
      }

      System.out.println("Length of string = "+length);

    }
}
