package com.cybertek.tests.day11_file_upload;

import org.testng.annotations.Test;

public class filePathExample {

    @Test
    public void test() {

//C:\Users\muham\Desktop\SDET\Coding\EU2TestNGProject\src\test\resources\testfile.txt
        String projectPath=System.getProperty("user.dir");

        String relativePath="src\\test\\resources\\testfile.txt";

        String filePath=projectPath + "\\" + relativePath;
        System.out.println("filePath = " + filePath);
    }

}
