package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Dropdown {

    public static void main(String[] args ){
        System.setProperty("webdriver.chrome.driver", "resources/executables/chrome/chromedriver_mac64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--kiosk");
        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
//        select.selectByIndex();
//        select.deselectByValue();
    }
}
