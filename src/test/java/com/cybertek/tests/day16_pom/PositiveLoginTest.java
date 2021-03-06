package com.cybertek.tests.day16_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    @Test
    public void loginAsDriver(){


        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        loginPage.login(username,password);

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/","verify we successfuly login");

    }

    @Test
    public void loginDriver() {
        loginPage.loginAsDriver();
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/","verify we successfuly login");

    }
//    @Test
//    public void loginStoreManager() {
//        loginPage.loginStoreManager();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/","verify we successfuly login");
//    }
    @Test
    public void testCase1(){
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        loginPage.login(username,password);

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/","verify we successfuly login");






    }



}
