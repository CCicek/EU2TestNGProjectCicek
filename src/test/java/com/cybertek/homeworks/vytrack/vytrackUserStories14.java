package com.cybertek.homeworks.vytrack;

import com.cybertek.utilities.WebDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class vytrackUserStories14 {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException, IOException {
        Thread.sleep(5000);
        //File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src, new File("C:\\Users\\muham\\Desktop\\SDET\\Automation\\ScShot" + rn.nextInt() +".png"));
        sS();
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException, IOException {

        driver.get("http://qa1.vytrack.com/user/login");
        Actions actions = new Actions(driver);
        sS();
        login("storemanager69","UserUser123");
        sS();
        actions.moveToElement(driver.findElement(By.xpath("(//span[@class=\"title title-level-1\"])[2]"))).perform();
        sS();
        driver.findElement(By.xpath("//span[contains(text(),'Vehicles Model')]")).click();
        Thread.sleep(5000);
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://qa1.vytrack.com/entity/Extend_Entity_VehiclesModel";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test
    public void test2() throws IOException, InterruptedException {
        driver.get("http://qa1.vytrack.com/user/login");
        Actions actions = new Actions(driver);
        sS();
        login("storemanager69","UserUser123");
        sS();
        actions.moveToElement(driver.findElement(By.xpath("(//span[@class=\"title title-level-1\"])[2]"))).perform();
        sS();
        driver.findElement(By.xpath("//span[contains(text(),'Vehicles Model')]")).click();
        sS();
        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();

    }



    void login(String name,String password){
        driver.findElement(By.id("prependedInput")).sendKeys(name);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        driver.findElement(By.id("_submit")).click();
    }
    void sS() throws IOException, InterruptedException {
        Thread.sleep(3000);
        Random rn = new Random();
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\muham\\Desktop\\SDET\\Automation\\Ss\\ScShot" + rn.nextInt() +".png"));
    }
}
