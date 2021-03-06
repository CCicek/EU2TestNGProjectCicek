package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

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

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));
        dropdownElement.click();

        List<WebElement> dropDownOptions = driver.findElements(By.className("dropdown-item"));

        System.out.println("dropDownOptions.size() = " + dropDownOptions.size());

        for (WebElement Option : dropDownOptions) {
            System.out.println(Option.getText());

        }
        //click yahoo
        dropDownOptions.get(2).click();



    }
}
