package com.cybertek.tests.day15_properties_driver_tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.NextBaseCrm;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void test1() {

        String browser = ConfigurationReader.get("browser");
        System.out.println("browser = " + browser);

    }
}
