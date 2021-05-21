package com.ReviewClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonMethod {
    public static WebElement FindElementByXpath(WebDriver driver, String path){
       return driver.findElement(By.xpath(path));

    }
    public static void openBrowser(WebDriver driver,String url){
        driver.get(url);
    }
}
