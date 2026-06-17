package com.practice.selenium;

//import org.apache.commons.io.FileUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TakingScreenShot  {

/* To take screeshot on test failure, we have to extend TestListenerAdapter class of TestNG
 and override onTestFailure(ITestResult result) method */

    public static void takeScreenShot() throws Exception {
        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/books");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("login")).click();

//        Take Screenshot
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

       long currentTime =  System.currentTimeMillis();

       File dest = new File("screenshots/screenshot"+currentTime+".jpeg");
        FileUtils.copyFile(srcFile,dest);

        System.out.println("Screenshot captured and copied to "+dest.getAbsolutePath());

    }

    public static void main(String[] args) throws Exception {
        takeScreenShot();
    }
}