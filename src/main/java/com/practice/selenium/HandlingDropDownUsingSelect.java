package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelect {

	public static void main(String[]args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		Select select = new Select(dropDown);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("1");
		Thread.sleep(2000);
		select.selectByVisibleText("Option 2");

	}
}
