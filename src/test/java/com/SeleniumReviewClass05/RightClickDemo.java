package com.SeleniumReviewClass05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RightClickDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
       WebElement rightClickBtn= driver.findElementByXPath("//span[text()='right click me']");
       Actions action=new Actions(driver);
       action.contextClick(rightClickBtn).perform();
       driver.quit();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //njs.executeScript()
        TakesScreenshot ts=(TakesScreenshot) driver;
       File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/Smartbear/adminLogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
