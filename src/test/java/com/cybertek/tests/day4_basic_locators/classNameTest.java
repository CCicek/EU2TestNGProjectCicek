package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//Class mostly use fore navigate between pages
//If there is a"space" in the class attribute value,we CANNOT use it
//we well use it later to locate multiple elemnts in one shot
public class classNameTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //driver.findElement(By.className("nav-link")).click();

        System.out.println(driver.findElement(By.className("h3")).getText());


    }
}
