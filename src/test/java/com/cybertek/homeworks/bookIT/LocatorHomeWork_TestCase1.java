package com.cybertek.homeworks.bookIT;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHomeWork_TestCase1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        https://www.ebay.com/
        driver.get("https://www.ebay.com/");

        Thread.sleep(1000);
        WebElement input = driver.findElement(By.id("gh-ac"));

        input.sendKeys("tesla");
        driver.findElement(By.id("gh-btn")).click();

        System.out.println(driver.findElement(By.tagName("h1")).getText());

        driver.quit();

    }

}
