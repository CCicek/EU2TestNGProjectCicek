package com.cybertek.tests.day13_webtables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesExamples {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();

    }


    @Test
    public void printTable() {
        WebElement table = driver.findElement(By.id("table1"));
        System.out.println(table.getText());
        Assert.assertTrue(table.getText().contains("jsmith@gmail.com"),"it contains");
    }

    @Test
    public void getAllHeaders() {

       List <WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println(headers.size());

        for (WebElement header:headers) {
            System.out.println(header.getText());
        }
    }

    @Test
    public void printTableSize() {
        //number of columns
        List <WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());
        //number of rows with header
        List <WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("rows.size() = " + rows.size());
        //number of rows without headers
        List <WebElement> rowsWithoutHeader = driver.findElements(By.xpath("//*[@id=“table1”]/tbody/tr"));
        System.out.println("rowsWithoutHeader.size() = " + rowsWithoutHeader.size());
    }

    @Test
    public void getRow(){
        //print the second row information
        WebElement secondRow = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]"));
        //System.out.println(secondRow.getText());

        //get all the rows dynamically
        //1.find the number of rows
        //2.iterate one by one

        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        for (int i = 1; i <=allRows.size() ; i++) {

            WebElement row = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]"));
            System.out.println(row.getText());

        }
    }

    @Test
    public void getAllCellInOneRow() {
        List<WebElement> allCellsInOneRow =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[3]/td"));
        for (WebElement cell: allCellsInOneRow) {
            System.out.println(cell.getText());

        }
    }

    @Test
    public void getAsingleCellByIndex() {
        WebElement singleCell =driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[5]"));
        System.out.println(singleCell.getText());
    }

    @Test
    public void printAllCellByIndex() {


        int rowNumber = getNumberOfRows();
        int colNumber = getNumberOfColumns();

        System.out.println("colNumber = " + colNumber);
        System.out.println("rowNumber = " + rowNumber);

//        "//table[@id='table1']/tbody/tr[1]/td[1]"
//        "//table[@id='table1']/tbody/tr[1]/td[2]"
//        "//table[@id='table1']/tbody/tr[4]/td[6]"
        //iterate through each row on the table
        for (int i = 1; i <=rowNumber ; i++) {

            //iterate through each cell for each row
            for (int j = 1; j <=colNumber ; j++) {
                String cellXpath = "//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]";
                System.out.println(cellXpath);

                WebElement cell = driver.findElement(By.xpath(cellXpath));
                System.out.println(cell.getText());

            }

        }

    }

    private int getNumberOfColumns() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return headers.size();
    }

    private int getNumberOfRows() {
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRows.size();
    }


}
