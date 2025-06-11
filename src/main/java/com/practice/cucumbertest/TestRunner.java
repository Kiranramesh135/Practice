package com.practice.cucumbertest;


//import io.cucumber.junit.platform.engine.c
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(glue = "stepdefinitions",
features ="cucumbertests/")
public class TestRunner {


}
