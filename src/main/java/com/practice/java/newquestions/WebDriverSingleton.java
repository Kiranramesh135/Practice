package com.practice.java.newquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private static WebDriver driver;

    private WebDriverSingleton() {

    }

    public static WebDriver getDriver() {

        if(driver == null) {
            return new ChromeDriver();
        }

        return driver;
    }


}
