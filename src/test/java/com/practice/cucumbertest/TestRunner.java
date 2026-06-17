package com.practice.cucumbertest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/practice/cucumbertest/features",
        glue = "com.practice.cucumbertest.stepdefinitions")
public class TestRunner {
}
