package com.cybertek.homeworks.vytrack;

import com.cybertek.pages.BasePage;
import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class JamalTestcase2105 extends TestBase {

    @BeforeMethod
    public void setUpLoginToCalendar() {
      new LoginPage().loginAsStoremanager();
      new DashboardPage().navigateToModule("Activities","Calendar Events");
    }

    @Test
    public void tc1() {

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        Assert.assertTrue(calendarEventsPage.options.isDisplayed(),"option button is not displayed");
        Assert.assertEquals(calendarEventsPage.options.getText(),"Options","Button name is not same as expected result 'options'");
    }

    @Test
    public void tc2() {

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        Assert.assertEquals(calendarEventsPage.pagenumber.getAttribute("value"),"1","Page number is 1");

    }

    @Test
    public void tc3() {

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        Assert.assertEquals(calendarEventsPage.pagesize.getText(),"25","Verify that view per page number is equals to 25");
    }

    @Test
    public void tc4() throws InterruptedException {
        //cant possible to do for a now
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        Thread.sleep(10000);
    }
    @Test
    public void tc5() {

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.allCheckBoxes.click();
        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@tabindex='-1']"));
        for (WebElement allCheckBox : allCheckBoxes) {
            Assert.assertTrue(allCheckBox.isSelected(),"all checkboxes not selected");
        }

    }
    @Test
    public void tc6() throws InterruptedException {

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

      //  calendarEventsPage.waitUntilLoaderScreenDisappear();
       Thread.sleep(5000);
        calendarEventsPage.testersMeeting.click();
        List<WebElement> meetingData = driver.findElements(By.cssSelector("div[class=control-label]"));

        for (WebElement meetingDatum : meetingData) {
            Assert.assertTrue(meetingDatum.isDisplayed(),"Check all data is displayed");
        }


    }

}
