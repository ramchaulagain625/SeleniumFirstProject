package com.seleniumClass10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement username = driver.findElement( By.id("ctl00_MainContent_username"));
        username.sendKeys( "Tester");
        WebElement password = driver.findElement( By.id("ctl00_MainContent_password"));
        password.sendKeys( "test", Keys.ENTER );
        TakesScreenshot ts=(TakesScreenshot)driver;
      File sourcefile=ts.getScreenshotAs(OutputType.FILE);//the screen Shot is taken
        try {
            FileUtils.copyFile(sourcefile,new File("screenshots/smartbearsoftware/adminLogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
