package com.practice.cucumbertest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TestLogin {

    @Given("I am on Login page")
    public void i_am_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test test");

    }

    @When("I enter {string} and {string}")
    public void i_enter_emp_name_and_u_name(String empName, String uName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(empName+" "+uName);
    }
}
