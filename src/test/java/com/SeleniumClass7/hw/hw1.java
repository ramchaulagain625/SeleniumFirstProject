package com.SeleniumClass7.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class hw1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/browser-windows");
        String firstWindowHandle= driver.getWindowHandle();
        driver.findElementById("tabButton").click();
        driver.findElementById("windowButton").click();
        driver.findElementById("messageWindowButton").click();
        Set<String> allWindowsHandles= driver.getWindowHandles();
        Iterator<String> it= allWindowsHandles.iterator();
        while(it.hasNext()){
           String handle= it.next();
           driver.switchTo().window(handle);
            System.out.println(handle+" : "+driver.getTitle());
        }

    }
}
