package com.practice.java.oldquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebDriverThreadLocal {

        private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

        private SingletonWebDriverThreadLocal() {

        }

        public static synchronized WebDriver getDiver() {

            if (driver.get() == null) {
                driver.set(new ChromeDriver());
            }

            return driver.get();
        }
}