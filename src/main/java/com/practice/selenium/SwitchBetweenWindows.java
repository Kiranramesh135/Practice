package com.practice.selenium;

import java.awt.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenWindows {
	
	public static void main(String[]args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement link = driver.findElement(By.xpath("//a[text()='Click Here']"));

		String parent = driver.getWindowHandle();

		for(int i=0;i<5;i++) {
			link.click();
			driver.switchTo().window(parent);
		}

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> windows = handles.iterator();

		while(windows.hasNext()) {
			String child = windows.next();
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				driver.close();
				Thread.sleep(2000);
			}
		}

		driver.switchTo().window(parent);

	}

}
