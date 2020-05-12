package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DisplayDemoTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement userNameInput = driver.findElement(By.id("username"));

        System.out.println("userNameInput.isDisplayed() = " + userNameInput.isDisplayed());

        Assert.assertFalse(userNameInput.isDisplayed(),"verify is not displayed");

        WebElement loginButton = driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]"));

        loginButton.click();

        Thread.sleep(10000);

        System.out.println("---------------afterclick-------------------");
        System.out.println("userNameInput.isDisplayed() = " + userNameInput.isDisplayed());
        Assert.assertTrue(userNameInput.isDisplayed(),"verify is displayed");

        driver.quit();
    }


}
