package com.cybertek.homeworks.bookIT;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookIT {

   WebDriver driver = WebDriverFactory.getDriver("chrome");


    public BookIT() {



    }

        public void login(String username, String password){
     //  WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://cybertek-reservation-qa3.herokuapp.com/sign-in");

        driver.findElement(By.xpath("/html/body/app-root/div/app-sign-in-page/div/div/div/div/form/div[1]/div[2]/div/p/input")).sendKeys(username);

        driver.findElement(By.xpath("/html/body/app-root/div/app-sign-in-page/div/div/div/div/form/div[2]/div[2]/div/p/input")).sendKeys(password);

        driver.findElement(By.xpath("//button[@class='button is-dark']")).click();

    }


}
