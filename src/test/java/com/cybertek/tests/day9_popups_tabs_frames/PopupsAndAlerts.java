package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class PopupsAndAlerts {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //locate and click destroy the world button
        driver.findElement(By.xpath("//button[.='Destroy the World']")).click();
        //locate and click yes button
        driver.findElement(By.xpath("//button[.='Yes']")).click();
    }

    @Test
    public void Alerts() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //locate click Click for Js alerts

        driver.findElement(By.xpath("//button[1]")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //click ok button
        alert.accept();

        driver.findElement(By.xpath("//button[2]")).click();

        alert.dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[3]")).click();
        alert.sendKeys("Mike Smith");
        alert.accept();
        Thread.sleep(5000);

    }

    @Test
    public void switchWindowsTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/windows");

        //get title
        System.out.println("Title before new window: " + driver.getTitle());
        //click click here link
        Thread.sleep(1000);
        driver.findElement(By.linkText("Click Here")).click();
        //get title again
        Thread.sleep(1000);

        System.out.println("Title after new window: " + driver.getTitle());

        String currentWindowHandle = driver.getWindowHandle();
        System.out.println(currentWindowHandle);

        //we will switch to new window
        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("windowHandles = " + windowHandles.size());

        for (String handle : windowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
            }
        }

        System.out.println("Title after switching window: " + driver.getTitle());
    }

    @Test
    public void moreThan2Window() {
        driver.get("http://practice.cybertekschool.com/windows");

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("Before switch: " + driver.getTitle());


        //loop through each window
        for (String handle : windowHandles) {
            //one by one change it
            driver.switchTo().window(handle);

            //whenever your title equals to your expected window title
            if (driver.getTitle().equals("New Window")) {
                //stop on that window
                break;
            }
        }

        System.out.println("After switch: " + driver.getTitle());


    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");

        //how to switch frames
        //1.Switch by using name or id attribute of frame
        Thread.sleep(2000);
        driver.switchTo().frame("mce_0_ifr");
        //clear before sendkeys
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Mike Smith");
       // driver.findElement(By.xpath("//p")).sendKeys("Mike Smith");
        //goes back to first frame(main html)
        //goes back to first frame, useful when we have switched multipe frames
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        //2.USING INDEX
        driver.switchTo().frame(0);
        //clear before sendkeys
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Mike Smith WITH INDEX");

        //second way to switch parent
        driver.switchTo().parentFrame();

        //3.USING WEBELEMENT
        //locating iframe with any valid locator
        WebElement iframeElement = driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iframeElement);
        Thread.sleep(2000);

        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Mike Smith WITH WEBELEMENT");
    }
}