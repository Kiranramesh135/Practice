package com.practice.java.threadexample;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTask implements Runnable{

    String taskName;
    SampleCounter c = new SampleCounter();

    MyTask(String name) {
        this.taskName = name;
    }

    public void run() {
        System.out.println(taskName+" is running on "+ Thread.currentThread().getName());
//        WebDriver driver = new ChromeDriver();

        c.count();

    }



    public static void main(String[] args) {

        MyTask task1 = new MyTask("Task 1");
        MyTask task2 = new MyTask("Task 2");
        MyTask task3 = new MyTask("Task 3");

        Thread thread1 = new Thread(task1, "Thread-A");
        Thread thread2 = new Thread(task2, "Thread-B");
        Thread thread3 = new Thread(task3, "Thread-C");

        thread1.start();
        thread2.start();
        thread3.start();

//        System.out.println(c.counter);
    }
}
