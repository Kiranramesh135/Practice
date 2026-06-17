package com.practice.selenium.parallelexecution;

import org.testng.annotations.Test;

public class TestClass1 extends BaseTest {
    @Test
    public void googleTest() {
        driver.get("https://www.google.com");
        System.out.println("TestClass1 - " + Thread.currentThread().getId());
    }
}
