package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    @AfterMethod
    public void quit() throws InterruptedException {

    Thread.sleep(3000);
    driver.quit();

    }


    @Test
    public void test() {
       // WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dropdown");

        //1.locate your dropdown just like any other web element with unique locator

        WebElement dropdownElement = driver.findElement(By.id("state"));

        //2.Create Select object by passing that element as constructor

        Select stateDropdown = new Select(dropdownElement);

        //getOptions--> returns all the available options from the dropdown list
        List<WebElement> options = stateDropdown.getOptions();

        //print size of the options
        System.out.println("options.size() = " + options.size());

        //print options 1by1
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
    @Test
    public void test2() throws InterruptedException {
        // WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dropdown");

        //1.locate your dropdown just like any other web element with unique locator

        WebElement dropdownElement = driver.findElement(By.id("state"));

        //2.Create Select object by passing that element as constructor

        Select stateDropdown = new Select(dropdownElement);

        String expectedOption = "Select a State";
        String actualSelection = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection, expectedOption, "verify first selection");

        //How to selects option from dropdown
        //1.Select visible text
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Texas");

        expectedOption = "Texas";
        actualSelection = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection, expectedOption, "verify Texas selected");

        //2.Select using index
        Thread.sleep(2000);
        stateDropdown.selectByIndex(51);

        expectedOption = "Wyoming";
        actualSelection = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection, expectedOption, "verify Wyoming selected");


        //3.Select by
        Thread.sleep(2000);

        stateDropdown.selectByValue("DC");
        expectedOption = "District Of Columbia";
        actualSelection = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection, expectedOption, "verify District Of Columbia selected");

    }

}
