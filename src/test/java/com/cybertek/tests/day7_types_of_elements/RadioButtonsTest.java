package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest {

    /*
    Radio buttons is type of elements
     */

    @Test
    public void radioButtonTest1() {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioButton=driver.findElement(By.id("blue"));
        WebElement RedRadioButton=driver.findElement(By.id("red"));

        //how to check is radio button selected
        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        System.out.println("RedRadioButton.isSelected() = " + RedRadioButton.isSelected());
        //Task verify blue is slected red is not selected

        Assert.assertTrue(blueRadioButton.isSelected(),"verify blue is selected");
        Assert.assertFalse(RedRadioButton.isSelected(),"verify red is not selected");

        //how to select redio button?
        //we use click method to select radio buttons

        RedRadioButton.click();


        Assert.assertFalse(blueRadioButton.isSelected(),"verify blue is selected");
        Assert.assertTrue(RedRadioButton.isSelected(),"verify red is not selected");



        driver.findElement(By.id("green")).click();
    }


}
