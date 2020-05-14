package com.cybertek.homeworks.bookIT;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorHomeWork_TestCase3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.wikipedia.org/");

        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");

        driver.findElement(By.xpath("//i[@data-jsl10n='search-input-button']")).click();

        driver.findElement(By.linkText("Selenium (software)")).click();

        String actualUrl = driver.getCurrentUrl();

        String expectedUrlEnd="Selenium_(software)";

        if (actualUrl.endsWith(expectedUrlEnd)) {
            System.out.println("PASS");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrlEnd = " + expectedUrlEnd);
        }else{
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrlEnd = " + expectedUrlEnd);
        }

      driver.quit();
    }
}
