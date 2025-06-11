package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingFrames {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "resources/executables/chrome/chromedriver_mac64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--kiosk");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/selenium/guru99home/");
//		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a/img")).click();
	}

}
