package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//U can use in just 2 situtation
//1. if its tagname is only one
//2. if its tagname is firs point which you want

public class tagNameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.tagName("input")).sendKeys("Mike smith tag name");


        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.getTitle();


        //driver.quit();
    }
}
