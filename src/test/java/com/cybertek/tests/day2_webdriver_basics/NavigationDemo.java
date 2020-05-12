package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationDemo {
    public static void main(String[] args) {
        //setting up my chrome browser for automation
        WebDriverManager.chromedriver().setup();
        //creating driver object for chrome
        WebDriver driver = new ChromeDriver();
        //navigate to Google
        driver.get("https://www.google.com");
        //navigate to another website with different selenium method
        driver.navigate().to("https://www.facebook.com");
        //how to go back to google after we navigate to facebook
        //goes back to previous page
        driver.navigate().back();
    }
}
