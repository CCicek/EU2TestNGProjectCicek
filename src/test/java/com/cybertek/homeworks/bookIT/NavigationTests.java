package com.cybertek.homeworks.bookIT;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {


       WebDriver driver = WebDriverFactory.getDriver("chrome");

       driver.get("http://practice.cybertekschool.com/");

       WebDriver driver2= WebDriverFactory.getDriver("firefox");

       driver2.get("http://practice.cybertekschool.com/");

       WebDriver driver3=WebDriverFactory.getDriver("edge");

       driver3.get("http://practice.cybertekschool.com/");
    }

}
