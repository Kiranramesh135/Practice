package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionsClass {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "resources/executables/chrome/chromedriver_mac64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--kiosk");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com");
		WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Welcome to the-internet')]"));
		Actions actions = new Actions(driver);
		actions.contextClick(heading).build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


//		driver.findElement(By.linkText("Print...")).click();


		//incomplete code
		
//		driver.quit();
	}
}
