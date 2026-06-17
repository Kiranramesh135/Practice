package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "userName")
    WebElement usernameTextField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordTextField;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(id="name")
    WebElement errorMessage;


    LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void login(String userName, String password) {
        usernameTextField.sendKeys(userName);
        passwordTextField.sendKeys(password);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
        Assert.assertEquals(errorMessage.getText(),"Invalid username or password!");
    }
}
