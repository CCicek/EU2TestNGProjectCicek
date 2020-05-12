package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {
/**
 * open browser
 * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
 * enter any email
 * verify that email is displayed in the input box
 * click on Retrieve password
 * verify that confirmation message says 'Your e-mail's been sent!'
 */
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement putEmail = driver.findElement(By.name("email"));

        String expectedMail ="test@gmail.com";
        putEmail.sendKeys(expectedMail);

        String actualMail = putEmail.getAttribute("value");
        System.out.println("First test result:");
        if(actualMail.equalsIgnoreCase(expectedMail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        WebElement clickButton = driver.findElement(By.id("form_submit"));

        clickButton.click();

        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));

        String actualResult = confirmationMessage.getText();
        String expectedResult="Your e-mail's been sent!";

        System.out.println("Secon test result:");
        if(actualResult.equalsIgnoreCase(expectedResult)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
