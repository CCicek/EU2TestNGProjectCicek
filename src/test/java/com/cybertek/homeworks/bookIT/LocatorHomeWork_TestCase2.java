package com.cybertek.homeworks.bookIT;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorHomeWork_TestCase2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.com/");

        driver.get("https://www.amazon.com/");

        Thread.sleep(500);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tesla");

        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

        String actual = driver.getTitle();
        String expected="tesla";

        if(actual.contains(expected)){

            System.out.println("PASS");
        }else{

            System.out.println("FAIL");
        }

        driver.quit();
    }

}
