package com.practice.java.newquestions;

import io.cucumber.java.hu.Ha;
import io.cucumber.java.it.Ma;
import io.cucumber.java.sl.In;
import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.types.selectors.TypeSelector;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.ClassDefinition;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.*;

public class Aapractice {

    public static void main(String[] args) {
        int n = 16756784;

        String s = String.valueOf(n);

        Stack<Integer> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            int digit = ch - '0';

            while (!stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
            }

            stack.push(digit);
        }

        System.out.println(stack);
    }

 }



