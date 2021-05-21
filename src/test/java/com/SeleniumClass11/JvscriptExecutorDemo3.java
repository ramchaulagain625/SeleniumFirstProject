package com.SeleniumClass11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.ReviewClass04.commonMethod.openBrowser;

public class JvscriptExecutorDemo3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        openBrowser(driver,"http://google.com");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.open();");
    }
}
