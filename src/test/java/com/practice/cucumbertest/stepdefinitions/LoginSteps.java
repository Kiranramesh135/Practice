package com.practice.cucumbertest.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

   WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @When("I enter userName and password")
    public void i_enter_user_name_and_password() {
        driver.findElement(By.id("email")).sendKeys("testuser");
        driver.findElement(By.id("pass")).sendKeys("testpass");
    }
    @And("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
    }
}
