package com.practice.java.newquestions;

public class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            throw new MyException("Testing MyException");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {

    MyException(String message) {
        super(message);
    }

}
