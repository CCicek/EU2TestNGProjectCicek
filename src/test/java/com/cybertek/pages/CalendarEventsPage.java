package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//div[@class=\"btn btn-link dropdown-toggle\"]")
    public WebElement options;

    @FindBy(xpath = "//input[@class='input-widget']")
    public WebElement pagenumber;

    @FindBy(xpath = "(//div[@class='btn-group'])[2]")
    public WebElement pagesize;

    @FindBy(css = "th>div>button>input")
    public WebElement allCheckBoxes;

    @FindBy(xpath= "//*[text()='Testers meeting']")
    public WebElement testersMeeting;

}