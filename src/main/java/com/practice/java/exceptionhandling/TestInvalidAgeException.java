package com.practice.java.exceptionhandling;

public class TestInvalidAgeException {

    public static void main(String[] args) throws InvalidAgeException {

        int age = 121;

        if(age<0 || age>120) {
            throw new InvalidAgeException("Invalid Age");
        }
    }
}
