package com.SeleniumClass7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://accounts.google.com/signup");
        String mainPageHandle=driver.getWindowHandle();
        WebElement linkText=driver.findElementByLinkText("Help");
        linkText.click();
        Set<String>allWindowHandle=driver.getWindowHandles();
        System.out.println(allWindowHandle);
        Iterator<String> iterator=allWindowHandle.iterator();
        mainPageHandle= iterator.next();
        String childHandle= iterator.next();
        System.out.println(childHandle);
        Thread.sleep(3000);
        driver.switchTo().window(mainPageHandle);

    }




}
