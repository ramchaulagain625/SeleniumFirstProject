package com.SeleniumClass12.testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static ChromeDriver driver;
    /*
     * This method will negative to a website by the given URL
     * */
    public void setWithSpecificUrl(String url){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void tearDown(){
        if(driver !=null){
            driver.quit();
        }

    }
}
