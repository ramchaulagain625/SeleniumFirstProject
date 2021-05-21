package com.SeleniumClass11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.ReviewClass04.commonMethod.openBrowser;

public class JsExecutorDemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        openBrowser(driver,"http://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-600)");
        WebElement backToTop= driver.findElementByXPath("//span[contains(text(),'back to top')]");
        js.executeScript("arguments[0].scrollIntoView(true)",backToTop);
    }
}
