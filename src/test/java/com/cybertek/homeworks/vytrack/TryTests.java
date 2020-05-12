package com.cybertek.homeworks.vytrack;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.NextBaseCrm;
import com.cybertek.utilities.ToolBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TryTests {
    WebDriver driver = Driver.get(ConfigurationReader.get("browser"));
   // ToolBox tool = new ToolBox();
    @BeforeMethod
    public void setupMethod() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException, IOException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void test4() throws IOException, InterruptedException {
        driver.get("https://www.businessinsider.com/");
        //tool.ss();
    }

    @Test
    public void test5() throws Exception {


                driver= Driver.get(ConfigurationReader.get("browser"));
                driver.get(ConfigurationReader.get("url"));

                driver.findElement(By.xpath("//input[@id='prependedInput']"))
                        .sendKeys(ConfigurationReader.get("driver_username"));

                driver.findElement(By.xpath("//input[@id='prependedInput2']"))
                        .sendKeys(ConfigurationReader.get("driver_password"));

                driver.findElement(By.xpath("//button[@id='_submit']"))
                        .click();

        ToolBox.ss(driver);
    }

    @Test
    public void test8() {
        NextBaseCrm.loginHelpdesk(driver);
      //   NextBaseCrm.loginHr(driver);
      //  NextBaseCrm.loginMarketing(driver);
    }

}
