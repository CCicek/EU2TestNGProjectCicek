package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlNotChanged {

    public static void main(String[] args) {

        /**
         * open chrome browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * click on Retrieve password
         * verify that url did not change
          */

        //open chrome browser

        WebDriver driver =  WebDriverFactory.getDriver("chrome");


        //go to http://practice.cybertekschool.com/forgot_passwordLinks

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedUrl= driver.getCurrentUrl();
//click on retrieve password

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();


        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.equalsIgnoreCase(expectedUrl)){

            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();




    }

}
