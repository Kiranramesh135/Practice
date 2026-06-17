package com.practice.selenium.parallelexecution;

import org.testng.annotations.Test;

public class TestClass2 extends BaseTest {
    @Test
    public void bingTest() {
        driver.get("https://www.bing.com");
        System.out.println("TestClass2 - " + Thread.currentThread().getId());
    }
}