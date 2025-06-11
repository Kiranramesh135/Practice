package com.practice.java.threadexample;

public class SampleCounter {

    public  int counter;

    public synchronized void count() {
        counter++;
    }
}
