package com.seleniumClass6.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php");
       // driver.findElementByXPath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li/a");
       String header= driver.getTitle();
       if(header.equalsIgnoreCase("AUTOMATION TESTING PLATFORM BY SYNTAX")){
           System.out.println("AUTOMATION TESTING PLATFORM BY SYNTAX");
       }else{
           System.out.println("You are on the wrong page");
       }
       //driver.quit();
    }
}
