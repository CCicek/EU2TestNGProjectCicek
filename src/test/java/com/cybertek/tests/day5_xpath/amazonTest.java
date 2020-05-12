package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com/");

        WebElement inputBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        inputBox.sendKeys("Java");
        Thread.sleep(500);

        driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();

        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText());

        driver.quit();


    }
}
