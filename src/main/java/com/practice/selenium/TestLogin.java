package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogin {


    @Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/books");
        driver.findElement(By.id("login")).click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin","pwd");
        driver.close();
    }
}
