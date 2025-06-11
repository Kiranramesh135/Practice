package com.practice.selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorPractice {

	@Test
	public void excuteAsyncScript() {

		System.setProperty("webdriver.chrome.driver", "resources/executables/chrome/chromedriver_mac64/chromedriver");

		WebDriver driver = new ChromeDriver();

		// Creating javascript interface object by type casting
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launching the site
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();

		// Set script timeout to 20 seconds
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

		// Declare and set the start time
		long star_time = System.currentTimeMillis();

		// Call aysncexecscript ot wait for 5 seconds
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1],5000);");

		// Get difference (currenTime - startTime) of time
		System.out.println("Pssed time: " + (System.currentTimeMillis() - star_time));
	}

	@Test
	public void executeScript() throws InterruptedException {

		WebDriver driver = null;
		try {

			System.setProperty("webdriver.chrome.driver",
					"resources/executables/chrome/chromedriver_mac64/chromedriver");

			driver = new ChromeDriver();

			// Creating the JavaScriptExecutor interace object type casting
			JavascriptExecutor js = (JavascriptExecutor) driver;

			driver.manage().window().maximize();

			// Launching the site
			driver.get("http://demo.guru99.com/V4/");

			WebElement button = driver.findElement(By.name("btnLogin"));

			System.out.println(button);

			// Login to Guru99
			driver.findElement(By.name("uid")).sendKeys("mngr34926");
			driver.findElement(By.name("password")).sendKeys("amUpenu");
			button.click();

			Thread.sleep(5000);

			// Perform click on Login button using JavascriptExecutor
			// js.executeScript("arguments[0].click();", button);

			// To generate Alert window using JavascriptExecutor
			js.executeScript("alert('Welcome to Guru99);");

			Thread.sleep(5000);
			
			ArrayList<String> a = new ArrayList<String>();
			
//			int[] a1 = {1,2,3,4};
			System.out.println(a.size());
			
			String b = "asdsadasda";
			b.length();
		
			

		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			driver.quit();
		}

	}

}
