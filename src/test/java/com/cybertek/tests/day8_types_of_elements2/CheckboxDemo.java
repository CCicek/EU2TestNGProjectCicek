package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxDemo {

    @Test
    public void checkBoxtest1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1=driver.findElement(By.xpath("//input[1]"));
        WebElement checkBox2=driver.findElement(By.xpath("//input[2]"));

        //how to verify checkbox is selected or not

        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

        //verify checkbox1 is not selected 2 is selected

        Assert.assertFalse(checkBox1.isSelected(),"check box 1 is not seleced");
        Assert.assertTrue(checkBox2.isSelected(),"check box is selected");

        //how to click checkbox?
        checkBox1.click();

        //verify checkboxes again

        //Assert.assertFalse(checkBox1.isSelected(),"check box 1 is not seleced");
        //Assert.assertTrue(checkBox2.isSelected(),"check box is selected");


        driver.quit();
    }
}
