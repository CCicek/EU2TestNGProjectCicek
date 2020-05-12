package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssDemo {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClick = driver.findElement(By.cssSelector("button=disappearing_button"));

        System.out.println(dontClick.getText());

        driver.quit();

/*for ID                    att#value
for class                   att.value
for attribute               tag[att='value'] or [att='value']
for dynamic begining part   tag[att ^ = 'value']
            ending part     tag[att $ = 'value']
for contains any part       tag[att * = 'value']
for same parent's index     <your css>:nth-of-type(index number) exp:.btn.btn-primary:nth-of-type(3)
for parent to child elements (>)      att>att>att> exp:ul>li>a or ul a
for no formula child to parent css
for following sibling       <known css> ~ tag exp:h3~button:nth-of-type(3)
 */










    }



}
