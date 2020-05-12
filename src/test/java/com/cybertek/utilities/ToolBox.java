package com.cybertek.utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ToolBox {

    public static void ss(WebDriver driver) throws IOException, InterruptedException {

        Thread.sleep(2000);
        Random rn = new Random();
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\muham\\Desktop\\SDET\\Automation\\Ss\\ScShot" + rn.nextInt() +".png"));
    }
}
