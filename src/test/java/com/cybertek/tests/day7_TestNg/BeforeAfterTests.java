package com.cybertek.tests.day7_TestNg;

import org.testng.annotations.*;

public class BeforeAfterTests {

    @BeforeMethod
    public void setUp() {

        System.out.println("Before Method Here");

        System.out.println("WebDriverPart");
    }

    @Test
    public void test1() {
        System.out.println("This my test 1");
    }

    @AfterMethod
    public void tearDown() {

        System.out.println("After Method Here");
        System.out.println("Driver Quit");
    }


    @Test
    public void test2() {
        System.out.println("Thid my test 2");
    }

    @Test
    public void test3() {
        System.out.println("This my Test 3");
    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("--BEFORE CLASS--");
        System.out.println("RUNS ONLY ONE IN THE CLASS");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("--AFTER CLASS--");
        System.out.println("RUNS ONLY ONE IN THE CLASS");
        System.out.println("GENERATE REPORT");
    }

    // @BeforeMethod
   // public void test4() {
   //     System.out.println("deneme");
   // }
}
