package com.cybertek.tests.day7_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertionsDemo {


    @Test
    public void test1() {
        System.out.println("First Assertion");
        Assert.assertEquals("title","title");
    }


    @Test
    public void test2() {
        System.out.println("Second Assertion");
        Assert.assertEquals("title","title");

    }

    @Test
    public void test3() {
        System.out.println("Secon test case");
        Assert.assertEquals("title","title");


    }


}
