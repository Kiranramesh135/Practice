package com.practice.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTest {


    @Test
    public void test() {
        System.out.println("Inside test method");
        Assert.assertEquals("abc","abd");
    }
}
