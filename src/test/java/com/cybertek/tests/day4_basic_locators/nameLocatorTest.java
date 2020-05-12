package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//name locator is not dynamic %99,99 time
//but it can be duplicate(radio buutons) be carefull
public class nameLocatorTest {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //Make browser full screen

        driver.manage().window().fullscreen();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullname=driver.findElement(By.name("full_name"));

        fullname.sendKeys("Mike Smith");

        WebElement email = driver.findElement(By.name("email"));

        email.sendKeys("mikesmith@gmail.com");

        //proper way
        WebElement signbutton = driver.findElement(By.name("wooden_spoon"));

        //lazy way
        //driver.findElement(By.nameTag("button")).click();

        signbutton.click();

        WebElement verifymessage = driver.findElement((By.name("signup_message")));

        String expectedMessage= "Thank you for signing up. Click the button below to return to the home page.";

        String actualMessage = verifymessage.getText();

        if(actualMessage.equalsIgnoreCase(expectedMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.quit();
    }
}
