package com.cybertek.tests.day12_actions_jsexecuter;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();

    }

    @Test
    public void hover() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(driver);
        for (int i = 1; i <4 ; i++) {
            Thread.sleep(1000);
            WebElement img =driver.findElement(By.xpath("(//img)["+i+"]"));
            actions.moveToElement(img).perform();
            String actual =driver.findElement(By.xpath("(//h5)["+i+"]")).getText();
            String expected="name: user"+i;
            Assert.assertEquals(actual,expected,"Verirfy username");
            System.out.println(actual);
        }
        //Actions --> class that contains all the user interactions
//        how to create actions object / pasing driver as a constructor
       // Actions actions = new Actions(driver);

       // actions.moveToElement(img1).perform();

       // WebElement link = driver.findElement(By.linkText("View profile"));

       // Assert.assertTrue(link.isDisplayed(),"Verify View profile displayed");
    }

    @Test
    public void test1(){
        driver.get("https://www.google.com/");
        WebElement search1 = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
        search1.sendKeys("How to specify \"ENTER\" button functionality in Selenium WebDriver code?");
        search1.sendKeys(Keys.ENTER);
    }

}
